package com.company;

import com.company.TelewizorsPhilips.P43PFS5525;
import com.company.TelewizorsSamsung.TelewizorSamsung;
import com.company.TelewizorsSamsung.UE43AU7192U;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P43PFS5525 p43PFS5525 = new P43PFS5525("Unikalne id: 143212");
        int opcja = 0;
        System.out.println("1)Włącz 2)Wyłącz 3)Przełącz kanał 4)Zakończ działanie programu");
        while (opcja != 4){
            opcja = scanner.nextInt();
            switch (opcja){
                case 1:
                    p43PFS5525.wlacz();
                    break;
                case 2:
                    p43PFS5525.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj numer kanału: " );
                    int numerKanału = scanner.nextInt();
                    p43PFS5525.przelaczProgram(numerKanału);
                    break;
            }
        }
    }
}
