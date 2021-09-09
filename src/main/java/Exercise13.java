/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.lang.Math;

public class Exercise13 {
    public static void main(String[] args) {
        double principal;
        double interest;
        double years;
        double compoundTime;

        Scanner scan = new Scanner(System.in); //Double scanner.
        System.out.print("What is the principal amount? ");
        principal = scan.nextDouble();
        System.out.print("What is the rate? ");
        interest = scan.nextDouble();
        System.out.print("What is the number of years? ");
        years = scan.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compoundTime = scan.nextDouble();

        //Calculations:
        double a = (1 + (interest / 100 / compoundTime));
        double b = (compoundTime * years);
        double investment = principal * Math.pow(a,b);

        //Rounding up to two decimal places:
        double roundOff = Math.round(investment * 100.0) / 100.0;

        //Printing:
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(principal) + " invested at " + interest + "% for " + years + " years compounded " + compoundTime + " times per year is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(roundOff) + ".");

    }
}

