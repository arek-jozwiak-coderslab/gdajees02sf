package pl.coderslab.day1;

public class Person2  {

    public Person2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    private String lastName;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
