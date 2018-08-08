package pl.coderslab;

import org.springframework.stereotype.Component;

@Component
public class CityComponent {

    private final PeopleComponent peopleComponent;
    private final PeopleComponent2 peopleComponent2;

    public CityComponent(PeopleComponent peopleComponent, PeopleComponent2 peopleComponent2) {
        this.peopleComponent = peopleComponent;
        this.peopleComponent2 = peopleComponent2;
    }

    public PeopleComponent getPeopleComponent() {
        return peopleComponent;
    }

    public PeopleComponent2 getPeopleComponent2() {
        return peopleComponent2;
    }

    public String getCity(){
        return "GDANSK";
    }
}
