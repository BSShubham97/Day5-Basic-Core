package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class QuoRem {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Utility utility= new Utility();
        System.out.println("Enter the Dividend:");
        int didnd=sc.nextInt();
        System.out.println("Enter Divisor:");
        int divsr=sc.nextInt();
        utility.getQuotient(didnd,divsr);
        utility.getRemainder(didnd,divsr);
    }
}
