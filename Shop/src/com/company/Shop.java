package com.company;

import java.io.Serializable;

public class Shop implements Serializable {
    Employee[] employees = new Employee[2];
    int i = 0;
    public void addEmployee(Employee employee){
        employees[i]=employee;
        i++;
    }
}
