package pl.coderslab.day1;

public class Person implements Comparable<Person> {

    public Person(String lastName, String firstName) {
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

    @Override
    public int compareTo(Person o) {
        int result = this.getLastName().compareToIgnoreCase(o.getLastName());

        if (result == 0) {
            result = this.getFirstName().compareToIgnoreCase(o.getFirstName());
        }

        return result;
    }
}
