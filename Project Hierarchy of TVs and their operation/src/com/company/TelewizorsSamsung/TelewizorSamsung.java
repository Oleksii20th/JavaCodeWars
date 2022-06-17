package com.company.TelewizorsSamsung;

import com.company.Telewizor;

public abstract class TelewizorSamsung implements Telewizor {
    private boolean CzyWlaczony = false;
    private int NumerKanalu = 1;
    //rozmiar telewizora
    private int cale;

    protected TelewizorSamsung(int cale) {
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        CzyWlaczony = true;
        System.out.println("Samsung");
        wyswietlajObraz();
    }

    @Override
    public void wylacz() {
        System.out.println("Animacja wyłączenia");
        CzyWlaczony = false;
    }

    @Override
    public void przelaczProgram(int number) {
        if(CzyWlaczony){
            NumerKanalu = number;
        }
    }
   private void wyswietlajObraz(){
        //zeby caly czas w petli byl wyswietlany obrazek
       //w petli nie piszemy true bo bedzie dzialal do nieskonczonosci a potrzebujemi dopoki jest wlaczony
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (CzyWlaczony){
                    System.out.println("Wyswietlaj obrazek: " + NumerKanalu);
                    //uszpenia wątku na 3 sek
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
