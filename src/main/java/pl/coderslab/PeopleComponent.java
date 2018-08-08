package pl.coderslab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PeopleComponent {

    public int getPeople(){
        return 100;
    }
}
