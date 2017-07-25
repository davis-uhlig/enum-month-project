package com.example;

import com.example.common.Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Please select one of the following months...");
        System.out.println("--------------------------------------------");
        String[] months = Month.getMonths();
//
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
        String userMonthChoice = scanner.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("Your months plus its successive months...");
        System.out.println("------------------------------------------");
        System.out.println(Month.getSuccessiveMonths(userMonthChoice));

    }
}
