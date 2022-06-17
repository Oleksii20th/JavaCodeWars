package com.company;

import java.io.Serializable;

public class Human implements Serializable {
    String FirstName;
    String Surname;
    String Pesel;

    public Human(String firstName, String surname, String pesel) {
        FirstName = firstName;
        Surname = surname;
        Pesel = pesel;
    }

    public Human() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }
}
