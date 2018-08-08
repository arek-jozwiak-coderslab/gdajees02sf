package pl.coderslab.day2stream;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Janusz", "Nowak", 'M', LocalDate.parse("1973-02-13"), 2500));
        list.add(new Employee("Kubasz", "Nowak", 'M', LocalDate.parse("1980-01-29"), 2500));
        list.add(new Employee("Mart", "Fad", 'M', LocalDate.parse("1973-02-13"), 2500));
        list.add(new Employee("Oadsg", "Gas", 'K', LocalDate.parse("1995-02-14"), 2500));
        list.add(new Employee("Iadsg", "Gasd", 'K', LocalDate.parse("1996-02-18"), 2500));
        list.add(new Employee("Nsag", "Las", 'M', LocalDate.parse("1973-02-13"), 2500));
        list.add(new Employee("Pan", "Prezes", 'M', LocalDate.parse("1989-11-03"), 120000));

        list.stream().
                filter(s -> s.getLastName().startsWith("N")).
                forEach(System.out::println);

        list.stream().filter(s -> {
            long age = ChronoUnit.YEARS.between(s.getBirthday(), LocalDate.now());
            return age >= 30 && age <= 45;
        })
                .forEach(System.out::println);



        list.stream().filter(s -> s.getSex() == 'K')
                .filter(s -> {
                    long age = ChronoUnit.YEARS.between(s.getBirthday(), LocalDate.now());
                    return age >= 20 && age <= 30;
                }).filter(s -> s.getSalary() <= 3500)
                .map(s -> s.setSalary(s.getSalary() * 1.05))
                .forEach(System.out::println);


        List<Employee> employeeList = Arrays.asList(
                new Employee("Darek", "Nowak", 'M', LocalDate.of(1988, 8, 20), 2300.00),
                new Employee("Andżej", "Kowalski", 'M', LocalDate.of(1973, 3, 1), 1800.00),
                new Employee("Anna", "Korna", 'K', LocalDate.of(1994, 4, 24), 2000.00)
        );

        employeeList.stream()
                .filter(a -> a.getLastName().startsWith("N"))
                .forEach(a -> System.out.println(a.getLastName()));


        employeeList.stream()
                .filter(a -> Period.between(a.getBirthday(), LocalDate.now()).getYears() >= 30
                        && Period.between(a.getBirthday(), LocalDate.now()).getYears() <= 45)
                .forEach(a -> System.out.println(a.getLastName()));



        employeeList.stream()
                .filter(a -> a.getSex() == 'K')
                .filter(a -> Period.between(a.getBirthday(), LocalDate.now()).getYears() >= 20
                        && Period.between(a.getBirthday(), LocalDate.now()).getYears() <= 30)
                .filter(a -> a.getSalary() < 3500.00)
                .peek(a -> a.setSalary(a.getSalary() * 1.05))
                .forEach(a -> System.out.println(a.getLastName() + a.getSalary()));

    }



}
