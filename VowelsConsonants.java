package com.shubham;

import com.shubham.com.shubham.utility.Utility;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Utility utility=new Utility();
       System.out.println("Enter the alphabet");
       char alphabet=sc.next().charAt(0);
       utility.isVowel(alphabet);
    }
}
