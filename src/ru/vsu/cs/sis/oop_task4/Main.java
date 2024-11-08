package ru.vsu.cs.sis.oop_task4;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person phill = new Person("Phill", "Dortsman", LocalDate.of(2012, 11, 8),
                "Male", "Germany", "Russia");
        System.out.println(phill.getAge());
        Passport first = new Passport(phill, "2019", "356634", LocalDate.of(2019, 9, 30));
        Passport second = new Passport(phill, "2019", "356634", LocalDate.of(2019, 9, 30));
        System.out.println(first.equals(second));
    }
}