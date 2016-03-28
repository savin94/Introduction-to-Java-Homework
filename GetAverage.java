package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));

        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);

        double a = Double.parseDouble(first.next().replace(',','.'));
        double b = Double.parseDouble(second.next().replace(',','.'));
        double c = Double.parseDouble(third.next().replace(',','.'));

        double average = calculateAverage(a,b,c);
        System.out.println(String.format("The average is: %.2f",average));

    }
        private static double calculateAverage(double a, double b, double c){
        double sum = a + b + c;
        double average = sum/3;
        return average;
    }

    }
