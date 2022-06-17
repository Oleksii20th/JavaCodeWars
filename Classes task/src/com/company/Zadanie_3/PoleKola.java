package com.company.Zadanie_3;

public class PoleKola {
    public static final double PI = 3.14;
    public static double ObwodKola(double r){
        return PI * 2 * r;
    }
    public static double PoleKola(double r){
        return PI * r * r;
    }
    public static double ObwodProstokata(double a,double b){
        return 2 * (b + a);
    }
    public static double PoleProstokata(double a,double b){
        return b + a;
    }
}
