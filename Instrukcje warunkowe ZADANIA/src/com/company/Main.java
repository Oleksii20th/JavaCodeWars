package com.company;

import java.util.stream.Stream;

/*1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
(podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).

2. Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony jest podatek do 32%. Sprawdź ile podatku musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.

Wzór:
dla dochodu do 85 528 zł podatek wynosi 17%,
dla dochodu powyżej 85 528 zł liczy się go następująco:
- obliczamy podatek 17% z 85 528,
- dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
czyli dochód pomniejszony o 85 528 zł i z tego 32%.
(oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej wydatków niż przychodu, czyli podałby kwotę ujemną dochodu ;)

EDIT: jak wiadomo zmieniły się przepisy dotyczące obliczania podatku (drugi próg podatkowy powyżej 120 tys., kwota wolna od podatku do 30 tys., ulga dla klasy średniej, nieodliczalna składka zdrowotna 9%, itd.). Jeżeli ktoś jest odważny to może spróbować podjąć się obliczenia podatku dla takiego przypadku :)

3. Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić.
 Co więcej, niech będzie na tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
Dobrze jakbyś wykorzystał do tego instrukcję "switch" w
 celu jej przećwiczenia, chociaż na początek możesz spróbować to zrobić "if'em".
(podpowiedź: będziesz potrzebował co najmniej trzech zmiennych - dwie zmienne do
przechowywania liczb oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
(podpowiedź 2: znak operacji możesz przechowywać w zmiennej typu char)

 */
public class Main {

    public static void main(String[] args) {
        //1
        int liczba = 6;
        if(liczba % 2==0){
            System.out.println("Parzysta");
        }
        else{
            System.out.println("Nieparzysta");
        }

        //2
        double podatek = 96660;
        if(podatek < 0){
            System.out.println("Nie placisz podatku");
        }
        else if (podatek <= 85528){
            double kwota = podatek * 0.17;
            System.out.println("Podatek wynosi: " + kwota);
        }
        else{
            double niskiPodatek = podatek * 0.17;
            double wysokiPodatek = (podatek-85528) * 0.32;
            double kwota = niskiPodatek + wysokiPodatek;
            System.out.println("Podatek wynosi dla kwoty wyżej 85528: " + kwota);
        }
        //3
        char kalkulator = '/';
         int liczba1 = 8;
         int liczba2 = 4;
         int liczba3;
        switch (kalkulator){
            case '+':
              liczba3 = liczba1 + liczba2;
                System.out.println("+" + liczba3);
                break;
            case '-':
                 liczba3 = liczba1 - liczba2;
                System.out.println("-" + liczba3);
                break;
            case '/':
                liczba3 = liczba1 / liczba2;
                System.out.println("/" + liczba3);
                break;
            case '*':
                liczba3 = liczba1 * liczba2;
                System.out.println("*" + liczba3);
                break;
            default:
                System.out.println("Wybrales niepoprawny znak!!!!");
                break;
        }
    }
}
