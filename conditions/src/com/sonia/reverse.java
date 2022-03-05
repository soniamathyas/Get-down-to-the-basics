package com.sonia;

import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        int n=1234;
        int rev=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev);

    }
}