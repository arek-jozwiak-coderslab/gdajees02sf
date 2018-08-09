package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class ParamController {


    @RequestMapping("/random/{min}/{max}")
    @ResponseBody
    public String random(@PathVariable int max, @PathVariable int min) {
        Random random = new Random();
        int r = random.nextInt(max - min) + min;
        return "Użytkownik podał wartość . Wylosowano liczbę:  " + r + ".";
    }
}
