package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        System.out.println("Please enter third number");
        int c = scanner.nextInt();

        if (a >= 0){
            a = (int) Math.pow(a, 3);
        } else {
            a = 0;
        }
        if (b >= 0){
            b = (int) Math.pow(b, 3);
        } else {
            b = 0;
        }
        if (c >= 0){
            c = (int) Math.pow(c, 3);
        } else {
            c = 0;
        }
        System.out.println("Number 1 = " + a + " number 2 = " + b + " number 3 = " + c);
    }

    }
