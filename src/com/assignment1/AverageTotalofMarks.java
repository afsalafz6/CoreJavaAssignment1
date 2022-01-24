package com.assignment1;

import java.util.Scanner;

public class AverageTotalofMarks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] student1=new int[3];
        int[] student2=new int[3];
        int[] student3=new int[3];
        int[] average=new int[3];
        int[] total=new int[3];
        int i;
        System.out.println("Student 1");
        for(i=0;i<3;i++) {
            System.out.println("Enter mark of subject "+(i+1)+" :");
            student1[i]=input.nextInt();
        }
        System.out.println("Student 2");
        for(i=0;i<3;i++) {
            System.out.println("Enter mark of subject "+(i+1)+" :");
            student2[i]=input.nextInt();
        }
        System.out.println("Student 3");
        for(i=0;i<3;i++) {
            System.out.println("Enter mark of subject "+(i+1)+" :");
            student3[i]=input.nextInt();
        }
        for(i=0;i<3;i++) {
            if(i==0) {
                total[i]=student1[0]+student1[1]+student1[2];
                average[i]=total[i]/3;
            }
            if(i==1) {
                total[i]=student2[0]+student2[1]+student2[2];
                average[i]=total[i]/3;
            }
            if(i==2) {
                total[i]=student3[0]+student3[1]+student3[2];
                average[i]=total[i]/3;
            }
        }
        for(i=0;i<3;i++) {
            if(i==0) {
                System.out.println("The total marks scored by student "+(i+1)+" ="+total[i]);
                System.out.println("The average marks in three subjects scored by student "+(i+1)+" ="+average[i]);
            }
            if(i==1) {
                System.out.println("The total marks scored by student "+(i+1)+" ="+total[i]);
                System.out.println("The average marks in three subjects scored by student "+(i+1)+" ="+average[i]);
            }
            if(i==2) {
                System.out.println("The total marks scored by student "+(i+1)+" ="+total[i]);
                System.out.println("The average marks in three subjects scored by student "+(i+1)+" ="+average[i]);
            }
        }
    }
}
