package com.company;

public class School {
    private final int maxSchoolBoys = 54;
    private Schoolboys[] schoolboy = new Schoolboys[maxSchoolBoys];
    private int registrationSchoolBoy = 0;

    public void addSchoolBoy(Schoolboys schoolboys){
        if(maxSchoolBoys>registrationSchoolBoy){
            schoolboy[registrationSchoolBoy] = schoolboys;
            registrationSchoolBoy++;
        }
        else {
            System.out.println("You cann't add new schoolboy, the maximum limit is reached");
        }
    }
    public void showAllSchoolBoys(){
        for (int i = 0; i < schoolboy.length; i++){
            if(schoolboy[i]!=null){
                System.out.println(schoolboy[i].SchoolBoysInformation());
            }
        }
        }
    }

