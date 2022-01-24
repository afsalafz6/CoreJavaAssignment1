package com.assignment1;

import java.util.Scanner;

public class MarksAndResult {

    public static void main(String[] args){

        Double maths,science,social;

        Scanner mark =new Scanner(System.in);

        System.out.println("Enter Marks in Maths:");
        maths = mark.nextDouble();

        System.out.println("Enter Marks in Science:");
        science = mark.nextDouble();

        System.out.println("Enter Marks in Social:");
        social = mark.nextDouble();

        if(maths >= 60 && science >= 60 && social >= 60){
            System.out.println("PASSED");
        } else if((maths < 60 && science >= 60 && social >= 60) || (maths >= 60 && science < 60 && social >= 60) || (maths >= 60 && science >= 60 && social < 60)) {
            System.out.println("PROMOTED");
        } else {
            System.out.println("FAILED");
        }
    }
}
