package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Utility utility=new Utility();
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3=sc.nextInt();
        utility.getGreatest(num1,num2,num3);
    }
}
