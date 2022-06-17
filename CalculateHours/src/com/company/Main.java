package com.company;

public class Main {
    public static void main(String[] args) {
	HourlyCalculation hourlyCalculation = new HourlyCalculation();
    int Numberofhours = 12;
        System.out.println(Numberofhours +" hours it's "+
                hourlyCalculation.HourToMinute(Numberofhours)+" minutes");

        System.out.println(hourlyCalculation.HourToMinute(Numberofhours) +
                " minutes it's "+
                hourlyCalculation.MinuteToSecond(
                        hourlyCalculation.HourToMinute(Numberofhours)
        )+" seconds");

        System.out.println(hourlyCalculation.MinuteToSecond(hourlyCalculation.HourToMinute(Numberofhours)) +
                " seconds it's "+
                hourlyCalculation.SecondToMiliSecond(
                        hourlyCalculation.MinuteToSecond(
                                hourlyCalculation.HourToMinute(Numberofhours)
                        )
                )+" miliseconds");

        System.out.println(Numberofhours +" hours it's "+hourlyCalculation.HourToMilisecond(Numberofhours)+" miliseconds");
    }
}
