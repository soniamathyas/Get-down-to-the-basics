package com.sonia;

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5876575;

        int count = 0;
        while (n > 0) {
            int m = n % 10;
            if (m == 5) {
                count += 1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}