package com.sonia;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
//        if(num1>num2 & num1>num3) {
//            System.out.println("The largest number is " + num1);
//        }
//        else if(num2>num1 & num2>num3) {
//            System.out.println("The largest number is " + num2);
//        }
//        else{
//            System.out.println("The largest number is " +num3);
//
//        }
//        int max = num1;
//        if (num2 > max) {
//            max=num2;
//        }
//        if (num3 > max) {
//            max=num3;
//        }
//
//        System.out.println(max);
        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println(max);
        }
    }
