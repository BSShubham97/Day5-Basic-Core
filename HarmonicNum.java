package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class HarmonicNum {

    public static void main(String[] args){
        System.out.println(" Program for Harmonic number:");
        Scanner sc=new Scanner(System.in);
        Utility utility=new Utility();
//        float number;
        System.out.println("Enter the Nth value for harmonic number: ");
        int limit = sc.nextInt();
        System.out.print("H"+limit+"="+utility.nthHarmonic(limit));
//

    }
}
