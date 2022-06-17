package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ComputersCatalogs {

    public static void main(String[] args) {
        final int Exit = 0;
        final int ShowAllComputers = 1;
        final int ShowAndSortAllComputers = 2;
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Lenovo","80MR",3000);
        computers[1] = new Computer("HP","N550J",4400);
        computers[2] = new Computer("ASUS","X550CC",3600);

        Scanner scanner = new Scanner(System.in);
        int keyboard = -1;
        do {
            System.out.println("Exit the application - 0, Show all computers - 1, " +
                    "Show all computers sorted by price in ascending order - 2");
            keyboard=scanner.nextInt();
            scanner.nextLine();
            switch (keyboard){
                case Exit:
                    break;
                case ShowAllComputers:
                    System.out.println("We have such computers for sale:");
                    for (Computer computer:computers) {
                        System.out.println(computer);
                    }
                    break;
                case ShowAndSortAllComputers:
                    Arrays.sort(computers);
                    System.out.println("We have such computers for sale:");
                    for (Computer computer:computers) {
                        System.out.println(computer);
                    }
                    break;
                default:
                    System.out.println("Please choose the number 0, 1 or 2");
            }
        }while (keyboard!=0);
        scanner.close();


    }
}
