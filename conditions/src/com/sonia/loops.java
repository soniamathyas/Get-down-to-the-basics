package com.sonia;

import java.util.Scanner;

public class loops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the salary to know your bonus");
        int Salary= input.nextInt();
        if(Salary == 25000) {
            Salary += 10000;
            System.out.println("Your salary is now " + Salary);
        }
        else if(Salary > 25000){
                Salary+=5000;
                System.out.println("Your salary is now " + Salary);
            }
        else{
                System.out.println("No bonus for you");
            }
            }

    }