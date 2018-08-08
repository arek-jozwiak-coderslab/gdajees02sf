package pl.coderslab.day2stream;

import java.time.LocalDate;

public class Employee {
    
    private String firstName;
    private String lastName;
    private char sex;
    private LocalDate birthday;
    private double salary;
    
    public Employee(String firstName, String lastName, char sex, LocalDate birthday, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public Employee setSex(char sex) {
        this.sex = sex;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Employee setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s, %s, %s, %s", getLastName(), getFirstName(), getSex(), getBirthday(), getSalary());
    }

    public enum Sex {
        MALE, FEMALE;
    }
    
}
