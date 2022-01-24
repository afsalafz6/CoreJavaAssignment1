package com.assignment1;

import java.util.Scanner;

public class taxAmount {
    public static void main(String[] args) {
        Scanner inputCTC = new Scanner(System.in);
        System.out.print("Enter Your CTC : ");
        double ctc =inputCTC.nextDouble();

        double taxPayable;
        if((ctc>0) && (ctc<=180000)) {
            System.out.println("According to your CTC, your Tax Amount is NIL.");
        }
        if((ctc>180000) && (ctc<=300000)) {
            taxPayable=(ctc*0.10);
            System.out.println("According to your CTC, your Tax Amount is "+taxPayable);
        }
        else if((ctc>300000) && (ctc<=500000)) {
            taxPayable=(ctc*0.20);
            System.out.println("According to your CTC, your Tax Amount is "+taxPayable);
        }
        else if((ctc>500000) && (ctc<=1000000)) {
            taxPayable=(ctc*0.30);
            System.out.println("According to your CTC, your Tax Amount is "+taxPayable);
        }
    }
}
