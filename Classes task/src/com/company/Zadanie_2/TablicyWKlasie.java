package com.company.Zadanie_2;

public class TablicyWKlasie {
    private int[] tablica;

    public TablicyWKlasie(int[] tablica) {
        this.tablica = tablica;
    }

    public int SumaTablica(){
        int sum = 0;
        for (int i = 0; i< tablica.length;i++) {
            sum += tablica[i];
        }
        return sum;
    }
    public int SredniaTablica(){
        int srednia = 0;
        for (int i = 0; i< tablica.length;i++) {
            srednia += tablica[i];
        }
        srednia /= tablica.length;
        return srednia;
    }
    public int MinWartosc(){
        int MinWartosc = Integer.MAX_VALUE;
        for (int i = 0; i< tablica.length;i++) {
            if(tablica[i] < MinWartosc){
                MinWartosc = tablica[i];
            }
        }
        return MinWartosc;
    }
    public int MaxWartosc(){
        int MaxWartosc = Integer.MIN_VALUE;
        for (int i = 0; i< tablica.length;i++) {
            if(tablica[i] > MaxWartosc){
                MaxWartosc = tablica[i];
            }
        }
        return MaxWartosc;
    }
}
