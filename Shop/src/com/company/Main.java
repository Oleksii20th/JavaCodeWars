package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Mateusz","Nowak","12345678900",3000);
        Employee employee1 = new Employee("Marcin","Wójciek","09876543211",3500);
        Shop shop = new Shop();
        shop.addEmployee(employee);
        shop.addEmployee(employee1);
        String file = "Employees.txt";

        try {
            var WriteDataToFile = new FileInputStream(file);
            var Serialize = new ObjectInputStream(WriteDataToFile);
            Human human = (Human)Serialize.readObject();
            human.getSurname();
            System.out.println("Write data to file was successful");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("File write error!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
