package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/helloRequestParam")
    @ResponseBody
    private String helloRequest(@RequestParam(required = false) Integer paramName) {
        System.out.println(paramName);
        return "My param = " + paramName;
    }


    @RequestMapping("/requestParamsUri/{maxParam}/{countParam}")
    @ResponseBody
    private String requestParamsUri(@PathVariable("maxParam") long max, @PathVariable("countParam") int count) {
        return "My count = " + count + " My max = " + max;
    }

    @RequestMapping("/passParam/{max}/{count}")
    private String requestParamsUri(Model model,@PathVariable long max,
                                    @PathVariable int count)                                     {
        model.addAttribute("max", max);
        model.addAttribute("count", count);
        return "/passParam.jsp";
    }
}
