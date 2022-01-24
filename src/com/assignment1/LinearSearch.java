package com.assignment1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numberArray=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Number to Search:");
        int searchElement=input.nextInt();

        Boolean isFound = false;
        for(int i=0; i<numberArray.length; i++) {
            if(searchElement==numberArray[i]) {
                System.out.println("Element Found!!! at position : "+(i+1));
                isFound = true;
                break;
            }
        }
        if(isFound == false)
            System.out.println("Element you Searched for is not found");
    }

}
