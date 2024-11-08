package ru.vsu.cs.sis.oop_task4;

import java.time.LocalDate;
import java.util.Date;

public class Passport {
    private Person holder;
    private String series;
    private String number;
    private LocalDate dateOfIssue;

    public Passport(Person holder, String series, String number, LocalDate dateOfIssue) {
        this.holder = holder;
        this.series = series;
        this.number = number;
        this.dateOfIssue = dateOfIssue;
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
}