package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility=new Utility();
        System.out.println("Enter a Number:");
        int number= sc.nextInt();
        utility.primeFactors(number);
    }
}
