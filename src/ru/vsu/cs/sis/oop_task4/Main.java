package ru.vsu.cs.sis.oop_task4;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person phill = new Person("Phill", "Dortsman", LocalDate.of(2012, 11, 8),
                "Male", "Germany", "Russia");
        System.out.println(phill.getAge());
    }
}