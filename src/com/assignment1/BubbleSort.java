package com.assignment1;

public class BubbleSort {

    public static void main(String[] args){
        int[] numberArray=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int temp;
        System.out.println("Array Before Sorting :");
        for(int i=0; i<numberArray.length; i++) {
            System.out.print(numberArray[i]+" ");
        }

        for(int i=0;i<numberArray.length;i++) {
            for(int j=i+1; j<numberArray.length; j++) {
                if(numberArray[j] < numberArray[i]) {
                    temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        System.out.println("\n\n\n Array After Sorting");
        for(int i=0; i<numberArray.length; i++) {
            System.out.print(numberArray[i]+" ");
        }
    }
}
