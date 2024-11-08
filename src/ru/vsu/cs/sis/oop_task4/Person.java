package ru.vsu.cs.sis.oop_task4;

import java.time.LocalDate;
import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private int age;
    private String gender;
    private String birthPlace;
    private String location;

    public Person(String name, String surname, LocalDate birthday, String gender, String birthPlace, String location) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.age = LocalDate.now().getYear() - birthday.getYear();
        this.gender = gender;
        this.birthPlace = birthPlace;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getLocation() {
        return location;
    }
}