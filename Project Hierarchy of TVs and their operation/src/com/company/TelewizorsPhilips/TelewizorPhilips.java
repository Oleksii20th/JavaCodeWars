package com.company.TelewizorsPhilips;

import com.company.Telewizor;

import java.util.Optional;

public abstract class TelewizorPhilips implements Telewizor {
    private String id;
    private boolean statusWlaczony = false;
    private int ObecnyKanal = 1;
    //rozmiar telewizora
    private int cale;

    public String getId() {
        return id;
    }

    public int getCale() {
        return cale;
    }

    public TelewizorPhilips(String id, int cale) {
        this.id = id;
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        statusWlaczony = true;
        WyswietlNaEkran();
        System.out.println("Philips");
    }

    @Override
    public void wylacz() {
        System.out.println("Animacja Czarności");
        statusWlaczony = false;
    }

    @Override
    public void przelaczProgram(int number) {
        if(statusWlaczony){
            ObecnyKanal = number;
        }
    }

    private void WyswietlNaEkran(){
        //zeby caly czas w petli byl wyswietlany obrazek
        //w petli nie piszemy true bo bedzie dzialal do nieskonczonosci a potrzebujemi dopoki jest wlaczony
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                    //uszpenia wątku na 3 sek
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Program: " + ObecnyKanal);
                }
            } 
        }).start();
    }
}
