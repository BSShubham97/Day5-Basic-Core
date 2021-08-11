package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

        Utility utility = new Utility();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();
        utility.isfourdigit(year);
        utility.isLeapYear(year);
    }
}