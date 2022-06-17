package com.company;

public class Employee extends Human{
    double salary;

    public Employee(String firstName, String surname, String pesel, double salary) {
        super(firstName, surname, pesel);
        this.salary = salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name and surname of the employee: " + FirstName + Surname +
                " number of pesel: " + Pesel + "and salary: " + salary;
    }
}
