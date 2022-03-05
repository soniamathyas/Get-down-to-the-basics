package com.sonia;

import java.util.Scanner;

public class isoscelesarea{
    public static void main(String[] args){
        //area using only sides
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the identical length");
        int a= input.nextInt();
        System.out.println("Enter the other side");
        int b=input.nextInt();
        double v = (Math.sqrt(a * a - ((b * b) / 4))) * b;
        double area= (0.5 * v);
        System.out.println(area);
    }
}

//area using base and height
//          System.out.println("Enter the breadth and the height ");
//          Scanner input=new Scanner(System.in);
//          int breadth=input.nextInt();
//          int height=input.nextInt();
//          double area=0.5*breadth*height;
//          System.out.println(area);