package com.example.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duhlig on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public static String[] getMonths(){
       String allMonths[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       return allMonths;

    }

    public static ArrayList<String> getSuccessiveMonths(String userMonth){
        userMonth = userMonth.toUpperCase();
        ArrayList<String> successiveMonths = new ArrayList<>();
        boolean flag = false;
        for(Month month: Month.values()){
            if (month.name().equals(userMonth)){
                flag = true;
            }
            if (flag){
                successiveMonths.add(month.getEnglishName());
            }
        }
        return successiveMonths;
    }
}
