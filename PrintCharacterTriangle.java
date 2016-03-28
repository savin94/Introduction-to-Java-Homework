package com.company;

import java.util.Scanner;

public class PrintCharacterTriangle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int command = console.nextInt();
        char startChar = 'a';
        for (int i = 0; i < command; i++) {
            startChar = 'a';
            for (int j = 0; j < i + 1; j++) {

                System.out.print(startChar + " ");
                startChar++;
            }
            System.out.println();
        }

        for (int j = 0; j < command  ; j++) {
            startChar ='a';
            for (int k = 0; k <command - j  - 1; k++) {
                System.out.print(startChar + " ");
                startChar++;
            }
            System.out.println();
        }
    }
    }
