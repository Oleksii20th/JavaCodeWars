package com.company;

import java.util.List;

//Zadanie 1
/*
Stworzyć tablicę wejściową input zawierającą liczby typu int oraz
zwrócić tablicę zawierającą ilość elementów ujemnych oraz sumę elementów dodatnich.
Jeśli tablica była pusta lub null, wtedy należało zwrócić pustą tablicę.
 */
//Zadanie 2
/*
W zadaniu należy stworzyć algorytm sterujący pracą automatu z napojami.
Zakładaliśmy, że automat przyjmuje monety 1zł, 2zł i 5zł.
Puszka napoju kosztuje 1zł. Na starcie automat nie miał żadnych pieniędzy.
Dla wskazanej listy wejściowej monet, należało zwrócić true lub false w zależności czy automat będzie w stanie zwrócić resztę.
Każda moneta była wrzucana przez innego klienta.
 */
public class Main {

    //Stwórz tablicę która będzie pokazywała na ekran sumę liczb ujemnych oraz dodatnich
    public static void main(String[] args) {
        //krok 1 tworzymy tablice
        int[] tablica = SumElements(new int[]{1, 2, 3, -4, -3, -2, -1});
        if (tablica.length == 2) {
            System.out.println("--" + tablica[0]);
            System.out.println("+++" + tablica[1]);
        }
        //zadanie 2
        System.out.println(AutomatVendingowy(List.of(1, 2, 1, 2, 5))); // dla 5 zwracamy 2 dwójki
        System.out.println(AutomatVendingowy(List.of(1, 2, 1, 1, 5))); // dla 5 zwracamy 2 i 2 jedynki
        System.out.println(AutomatVendingowy(List.of(1, 1, 1, 1, 5))); // dla 5 zwracamy 4 jedynki

        System.out.println(AutomatVendingowy(List.of(1, 2, 2, 5, 2))); // błąd, nie da się wydać przy drugiej dwójce bo w autmacie jest tylko moneta 2 zł
    }

    //krok 2: tworzymy metode statyczna
    public static int[] SumElements(int[] table) {
        //krok 5 sprawdzamy czy liczba nie jest ujemna lub rowna zero
        if (table == null || table.length == 0) {
            return new int[0];
        }
        //krok 3 tworzymy sume elementów ujemnych i dodatnich
        int sum = 0;
        int count = 0;
        //krok 4 tworzyy petle
        for (var element : table
        ) {
            if (element > 0) {
                sum++;
            } else if (element < 0)
                count++;
        }
        return new int[]{count, sum};
    }

    public static boolean AutomatVendingowy(List<Integer> tableMoney) {
        //krok 1 stworzymy 2 zmiennych która przyjmuje wartość 2 i 1
        int money_1 = 0;
        int money_2 = 0;
        //krok 2 tworzymy petle i if else dla każdej wrzuconej monety
        for (var element : tableMoney
        ) {
            if (element == 1) {
                money_1++;
            } else if (element == 2) {
                //krok 3 gdy będzie wrzucono więcej monet zwracamy resztę(1 monetę)
                if (money_1 >= 1) {
                    money_2++;
                    money_1--;
                } else {
                    return false; //jeśli ktoś wrzucił 2zł muszę mieć minimum jedną monetę 1zł by wydać resztę inaczej false
                }
            } else if (element == 5)
                { //krok 4 tak samo jak krok 3 tylko więcej kombinacji 2 dwójki i td
                    if (money_2 >= 2) {
                        money_2 -= 2;
                    } else if (money_2 >= 1 && money_1 >= 2) {
                        money_2--;
                        money_1 -= 2;
                    } else if (money_1 >= 4) {
                        money_1 -= 4;
                    } else {
                        return false; // Nie udało mi się wydać monetę
                    }
                } else{
                    return false; // ktoś wrzucił nieprawidłową monetę
                }
        }
        return true;
    }
}
