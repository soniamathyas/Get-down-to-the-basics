package com.sonia;

import java.util.Scanner;


public class circlearea{
    public static void main(String[] args){
        double pi=3.14;
        System.out.println("Enter the radius");
        Scanner input= new Scanner(System.in);
        int radius=input.nextInt();
        double area=(radius*radius)*Math. PI;
        System.out.println(area);
    }
}