package pl.coderslab.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {


    @ResponseBody
    @RequestMapping("/check-login")
    public String checkLogin(HttpSession session) {
        if (session.getAttribute("loginStart") != null) {
            return session.getAttribute("loginStart") + "";
        } else {
            session.setAttribute("loginStart", LocalDateTime.now().toString());
        }
        return "";
    }

}
