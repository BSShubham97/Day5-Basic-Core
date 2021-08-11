package com.shubham;

import java.util.Scanner;

public class FlipCoin {

    public double coinFlip() {
        double face_Value;
        face_Value = Math.floor(Math.random() * 10 % 2);
        System.out.println("Value :" + face_Value);
        return (face_Value);
    }

    public static void main(String[] args) {
        FlipCoin fl = new FlipCoin();
        int i;
        double value;
        int head_count = 0;
        int tail_count = 0;
        double percentage_tails;
        double percentage_heads;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin:");
        int num = sc.nextInt();
        for (i = 0; i < num; i++) {
            value = fl.coinFlip();
            if (value < 0.5) {
                System.out.println("Tails");
                tail_count = tail_count + 1;

            } else {
                System.out.println("Heads");
                head_count = head_count + 1;

            }
            System.out.println("Number of tails:" + tail_count);
            System.out.println("Number of heads:" + head_count);
        }
        percentage_tails = (tail_count *100)/num;
        System.out.println("Percentage of Tails:" + percentage_tails + "%");
        percentage_heads = (head_count *100)/num;
        System.out.println("Percentage of heads:" + percentage_heads + "%");
    }
}
