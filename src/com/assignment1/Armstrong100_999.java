package com.assignment1;

public class Armstrong100_999 {

    public static void main(String[] args){
        int rem,tnum,temp,sum;
        for(int i =100; i < 1000; i++) {
            tnum = i;
            sum = 0;
            while (tnum > 0) {
                rem = tnum % 10;
                temp = rem * rem * rem;
                sum = temp + sum;
                tnum = tnum / 10;
            }
            if (i == sum)
                System.out.println(sum + " is an Armstrong Number" );
        }
    }


}
