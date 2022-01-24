package com.assignment1;

import java.util.Scanner;

public class SimpleCompondIntrest {

    public static void main(String[] args){

        double amount, intrestRate, years, simple,compound;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the amount:");
        amount=sc.nextDouble();

        System.out.println("Enter the No.of years:");
        years=sc.nextDouble();

        System.out.println("Enter the Rate of  interest");
        intrestRate=sc.nextDouble();

        simple=(amount * years * intrestRate)/100;
        compound=amount * Math.pow(1.0+intrestRate/100.0,years) - amount;

        System.out.println("Simple Interest="+simple);
        System.out. println("Compound Interest="+compound);
    }
}
