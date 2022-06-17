package com.company;

import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args) {
        final int Exit = 0;
        final int addSchoolBoy = 1;
        final int showSchoolBoy = 2;
        Schoolboys schoolboys = new Schoolboys();
        School school = new School();

        Scanner scanner = new Scanner(System.in);
        int keyboard = -1;
        do {
            System.out.println("Exit the application - 0, Add Schoolboy - 1, Show all schoolboys - 2");
            keyboard=scanner.nextInt();
            scanner.nextLine();
            switch (keyboard){
                case Exit:
                    break;
                case addSchoolBoy:
                    System.out.println("The name of the schoolboy: ");
                    schoolboys.setFirstName(scanner.nextLine());
                    System.out.println("The surname of the schoolboy: ");
                    schoolboys.setLastName(scanner.nextLine());
                    System.out.println("Pesel's schoolboy number: ");
                    schoolboys.setPesel(scanner.nextLine());
                    school.addSchoolBoy(schoolboys);
                    break;
                case showSchoolBoy:
                    school.showAllSchoolBoys();
                    break;
                default:
                    System.out.println("Please choose the number 0, 1 or 2");
            }
        }while (keyboard!=0);
        scanner.close();
    }
}
