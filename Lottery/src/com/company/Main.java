package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final int Exit = 0;
        Lottery lottery = new Lottery();
        Scanner scanner = new Scanner(System.in);
        int keyboard = -1;
        do {
            System.out.println("Exit the application - 0, Choose a number from 1 to 49 to your first million: ");
            keyboard=scanner.nextInt();
            scanner.nextLine();
            switch ((0 == keyboard ) ? 0 :
                    (1 <= keyboard && keyboard <= 49) ? 1:2){
                case Exit:
                    break;
                case 1:
                    lottery.GenerateNumbers();
                    lottery.Randomize();
                    System.out.println(lottery.Result(lottery.LotteryNumbers));
                    System.out.println("Unfortunately you didn't win your first million try next time !!!");
                    break;
                case 2:
                    System.out.println("I'm not between 1 and 49 inclusive. Choose a number from 1 to 49!");
                    break;
                default:
                    System.out.println("Please choose the number 0 or 1");
            }
        }while (keyboard!=0 && 1 >= keyboard && keyboard >= 49);
        scanner.close();
    }
}
