package com.sonia;

import java.util.Scanner;

public class rectanglearea{
    public static void main(String[] args){
        System.out.println("Enter the length and breadth");
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
        int breadth=input.nextInt();
        int area=length*breadth;
        System.out.println("The area od the rectangle is :" + area);

    }
}