package com.company;

import com.company.Zadanie_1.Programista;
import com.company.Zadanie_2.TablicyWKlasie;
import com.company.Zadanie_3.PoleKola;

public class Main {

    public static void main(String[] args) {
        Programista programista = new Programista("Kasia","Kapusta","polski",4000);
        System.out.println("Imie: "+programista.pobierzImie());
        System.out.println("Nazwisko: "+programista.pobierzNazwisko());
        System.out.println("Język: "+programista.pobierzJezyk());
        System.out.println("Wynagrodzenie: "+programista.pobierzWynagrodzenie());

        int[] tablica = {4,2,7,3};
        TablicyWKlasie tablicyWKlasie = new TablicyWKlasie(tablica);
        System.out.println("Suma " + tablicyWKlasie.SumaTablica());
        System.out.println("SredniaTablica " + tablicyWKlasie.SredniaTablica());
        System.out.println("MaxWartosc " + tablicyWKlasie.MaxWartosc());
        System.out.println("MinWartosc " + tablicyWKlasie.MinWartosc());


        System.out.println("ObwodKola " + PoleKola.ObwodKola(4));
        System.out.println("PoleKola  " + PoleKola.PoleKola(4));
        System.out.println("PoleProstokata  " + PoleKola.PoleProstokata(4,6));
        System.out.println("ObwodProstokata  " + PoleKola.ObwodProstokata(7,8));
    }
}
