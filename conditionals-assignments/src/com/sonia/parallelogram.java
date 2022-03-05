package com.sonia;

import java.util.Scanner;

public class parallelogram{
    public static void main(String[] args){
        System.out.println("Please enter the base and height");
        Scanner input=new Scanner(System.in);
        int base=input.nextInt();
        int height=input.nextInt();
        int area= base * height;
        System.out.println(area);
    }
}