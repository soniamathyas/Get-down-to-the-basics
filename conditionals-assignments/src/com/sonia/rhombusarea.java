package com.sonia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rhombusarea{
    public static void main(String[] args){
        System.out.println("Enter the sides");
        Scanner input = new Scanner(System.in);
        float p=input.nextFloat();
        float q=input.nextFloat();
        float area=(p*q)/2;
        System.out.println(area);

    }
}