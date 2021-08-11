package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Utility utility=new Utility();
        System.out.println("Enter FIRST number :");
        int num1= sc.nextInt();
        System.out.println("Enter SECOND number :");
        int num2= sc.nextInt();
        utility.doSwapping(num1,num2);
    }
}
