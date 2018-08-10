package pl.coderslab.day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.CityComponent;
import pl.coderslab.PeopleComponent;
import pl.coderslab.PeopleComponent2;

@Controller("homeela")
@RequestMapping("/home2")
public class HomeController {

    private final CityComponent cityComponent;

    @Autowired
    public HomeController(CityComponent cityComponent) {
        this.cityComponent = cityComponent;
    }

    @RequestMapping("/start")
    @ResponseBody
    public String start(){
        PeopleComponent peopleComponent = new PeopleComponent();
        PeopleComponent2 peopleComponent2 = new PeopleComponent2();
        CityComponent cityComponent = new CityComponent(peopleComponent, peopleComponent2);

        cityComponent.getPeopleComponent().getPeople();



        return "<h1>asdasd</h1> Witaj w: " + cityComponent.getCity()
                + cityComponent.getPeopleComponent().getPeople();
    }
}
