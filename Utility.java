package com.shubham.com.shubham.utility;

public class Utility {
    /**
     * Find Leap Year or Not
     */
    public void isLeapYear(int entYear) {
        /*Scanner sc=new Scanner(System.in);
        int entYear=sc.nextInt();*/
        if (((entYear % 4 == 0) && (entYear % 100 != 0)) || (entYear % 400 == 0)) {
            System.out.println("The year" + entYear + "ïs a Leap Year");
        } else
            System.out.println("Not a Leap Year");
    }

    /**
     * Check if  the digit is 4 number or not
     */
    public void isfourdigit(int year) {
        if (year > 999 && year < 9999) {
            System.out.println("Valid Entry");
        } else
            System.out.println("Invalid Entry");

    }

    /**
     *Power of Two
     */
    public void powerofTwo(int limit) {
        int i;
        int multiple;
        for (i = 0; i <= limit; i++) {
            multiple = (int) Math.pow(2, i);
            System.out.println("2 ^ " + i + "=" + multiple + "\n");

        }
    }

    /**
     * Harmonic Number finder
     */
    public static double nthHarmonic(int N) {
        // H1 = 1
        float harmonic = 1;

        // loop to apply the forumula
        // Hn = Hn-1 + 1/n
        for (int i = 2; i <= N; i++) {
            harmonic += (float) 1 / i;
        }

        return harmonic;
    }


    /**
     * Prime Factors of a number
     */
    public static void primeFactors(int num) {
        int i;
        while (num%2==0)
        {
            System.out.print(2+" ");
            num=num/2;
        }
        for(i=3;i<=(int)Math.sqrt(num);i+=2) {
            while (num % i == 0) {
                System.out.print(i +" ");
                num = num / i;

            }
        }
            if(num>2){
                System.out.print(" "+num);
            }
        }

    /**
     * To get quotient & Remainder
     * @param dividend Dividend to be divided
     * @param divisor Divisor to be divided by
     */
    public static void getQuotient(int dividend ,int divisor){
                int result;
                result=dividend/divisor;
                System.out.println("Quotient when we divide "+dividend+" by "+divisor+" is "+result);
        }


    public static void getRemainder(int dividend ,int divisor){
        int result;
        result=dividend%divisor;
        System.out.println("Remainder when we divide "+dividend+" by "+divisor+" is "+result);
    }

    /**
     * To swap two numbers
     * @param a Number 1
     * @param b Number 2
     */
    public static void doSwapping(int a , int b ){
        int space;
        System.out.println("Before Swapping Number 1 is "+a+" & Number 2 is "+b);
        space=a;
        a=b;
        b=space;
        System.out.println("After Swapping Number 1 is "+a+" & Number 2 is "+b);

    }

    /**
     * Even ODD check
     * @param num the number entered
     */
    public static void isOddEven(int num){
        if(num%2==0)
        {
            System.out.println("Number is EVEN");
        }
        else
            System.out.println("Number is ODD");
    }


    /**
     * IS Vowel or Consonent
     */
    public static void isVowel(char in) {
        if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u' || in == 'A' || in == 'E' || in == 'I' || in == 'O' || in == 'U') {
            System.out.println("The entered alphabet is Vowel");
        } else {
            System.out.println("The entered alphabet is a Consonant");
        }
    }

/**
 * To check the greater number among three numbers
 */

public static void getGreatest(int num1 ,int num2,int num3){

    if(num1>num2 && num1>num3)
    {
        System.out.println("The Greatest among the numbers is : "+num1);
    }
    else if(num2>num1 && num2>num3)
    {
        System.out.println("The Greatest among the numbers is : "+num2);
    }
    else
    {
        System.out.println("The Greatest among the numbers is : "+num3);
    }

}

}





