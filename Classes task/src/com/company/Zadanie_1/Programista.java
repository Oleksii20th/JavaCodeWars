package com.company.Zadanie_1;

public class Programista {
    private static String imie, nazwisko, jezyk;
    private static int zarobki;

    public Programista(String imie, String nazwisko, String jezyk, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.jezyk = jezyk;
        this.zarobki = zarobki;
    }
    public static String pobierzImie(){
        return imie;
    }
    public static String pobierzNazwisko(){
        return nazwisko;
    }
    public static String pobierzJezyk(){
        return jezyk;
    }
    public static int pobierzWynagrodzenie(){
        return zarobki;
    }
}
