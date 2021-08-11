package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class PowerTable {
/**
 * Program to table of the power 2^N
 */
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    Utility utility=new Utility();
    System.out.println("Enter the limit of power: ");
    int limitOfPow= sc.nextInt();
    utility.powerofTwo(limitOfPow);
}

}
