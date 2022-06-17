package com.company;

public class HourlyCalculation {
    int HourToMinute(int hours){
        return hours * 60;
    }
    int MinuteToSecond(int minute){
        return minute * 60;
    }
    int SecondToMiliSecond(int second){
        return second * 1000;
    }
    int HourToMilisecond(int hours){
        int minute = this.HourToMinute(hours);
        int second = this.MinuteToSecond(minute);
        int milisecond = this.SecondToMiliSecond(second);
        return milisecond;
    }
}
