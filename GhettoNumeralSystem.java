package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        char[] arr = number.toCharArray();
        String sum = "";
        for (int i = 0; i < arr.length; i++) {

            char current = arr[i];
            switch (current){
                case '0':
                    sum += "Gee";
                    break;
                case '1':
                    sum += "Bro";
                    break;
                case '2':
                    sum += "Zuz";
                    break;
                case '3':
                    sum += "Ma";
                    break;
                case '4':
                    sum += "Duh";
                    break;
                case '5':
                    sum += "Yo";
                    break;
                case '6':
                    sum += "Dis";
                    break;
                case '7':
                    sum += "Hood";
                    break;
                case '8':
                    sum += "Jam";
                    break;
                case '9':
                    sum += "Mack";
                    break;
            }
        }
        System.out.println(sum);
    }
    }