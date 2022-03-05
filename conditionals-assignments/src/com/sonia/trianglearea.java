package com.sonia;

import java.util.Scanner;

public class trianglearea{
    public static void main(String[] args){
        System.out.println("Enter the breadth and the height ");
        Scanner input=new Scanner(System.in);
        int breadth=input.nextInt();
        int height=input.nextInt();
        double area=0.5*breadth*height;
        System.out.println(area);
    }
}