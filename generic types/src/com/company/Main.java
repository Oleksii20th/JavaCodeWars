package com.company;

import javax.xml.crypto.dom.DOMCryptoContext;

/*Zadanie o typach ogólnych
• Utwórz klasę ogólną Trojka. Niech Trojka zawiera pola: P pierwsze, D drugie, T trzecie.
• W main utówrz tablicę Trojka[3] europa sparametryzowaną tak, aby nadawała się do
przechowywania danych geograficznych: państwo, stolica, liczba ludności (w mln). Np.
Polska, Warszawa, 38; Ukraina, Kijów, 37. Wpisz do tablicy europa 3 obiekty opisujące
Polskę, Ukrainę i Turcję.
• Wyświetl zawartość tych obiektów na konsoli.
	*/
public class Main {

    public static void main(String[] args) {
        Trójka<String,String, Integer> Europa[] = new Trójka[3];
        Europa[0] = new Trójka<String,String, Integer>("Polska", "Warszawa", 38);
        Europa[1] = new Trójka<String,String, Integer>("Ukraina", "Kijów", 37);
        Europa[2] = new Trójka<String,String, Integer>("Francja", "New-York", 36);
        for (Trójka t: Europa
             ) {
            System.out.println(t);
        }
    }
}
class Trójka <P, D, T>{
    P pierwsze;
    D drugie;
    T trzecie;

    public Trójka(P pierwsze, D drugie, T trzecie) {
        this.pierwsze = pierwsze;
        this.drugie = drugie;
        this.trzecie = trzecie;
    }

    @Override
    public String toString() {
        return "Trójka{" +
                "pierwsze=" + pierwsze +
                ", drugie=" + drugie +
                ", trzecie=" + trzecie +
                '}';
    }

}