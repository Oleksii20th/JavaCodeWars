package com.company;

public class Schoolboys {
    private String FirstName;
    private String LastName;
    private String Pesel;

    public Schoolboys(String firstName, String lastName, String pesel) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Pesel = pesel;
    }

    public Schoolboys() {
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String SchoolBoysInformation(){
        return FirstName + " " + LastName + " " + Pesel;
    }

}
