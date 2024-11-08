package ru.vsu.cs.sis.oop_task4;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private Person holder;
    private String series;
    private String number;
    private LocalDate dateOfIssue;
    private String birthPlace;
    private String location;

    public Passport(Person holder, String series, String number, LocalDate dateOfIssue) {
        this.holder = holder;
        this.series = series;
        this.number = number;
        this.dateOfIssue = dateOfIssue;
        this.birthPlace = holder.getBirthPlace();
        this.location = holder.getLocation();
    }

    public Person getHolder() {
        return holder;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(series, passport.series) && Objects.equals(number, passport.number) && Objects.equals(dateOfIssue, passport.dateOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, number, dateOfIssue);
    }
}