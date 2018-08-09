package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"count"})
public class IndexController {

    //    @RequestMapping("/index")
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @GetMapping("/index")
    public String index(HttpServletResponse response) {
        Cookie cookie = new Cookie("user", "Arek");
        response.addCookie(cookie);
        return "index";
    }

    @GetMapping("/index/set/cookie/some")
    public String indexCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("user", "Arek");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "index";
    }

    @RequestMapping("/cookieGet")
    @ResponseBody
    public String home(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        Cookie c = WebUtils.getCookie(request, "cookie2");
        c.setMaxAge(0);

        response.addCookie(c);

        return "cookie" + c.getValue();
    }


    @RequestMapping("/cookieGet1")
    @ResponseBody
    public String home1(@CookieValue("cookie1") String fooCookie) {
        return "cookie" + fooCookie;
    }


    @RequestMapping("/ses1")
    public String ses1(Model model, HttpSession session) {
        model.addAttribute("max", 12);
        model.addAttribute("count", 99);

        session.setAttribute("ooo", "ooo");

        return "ses";
    }
    @RequestMapping("/ses2")
    public String ses2(Model model) {
        return "ses";
    }

}