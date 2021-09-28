package com.company;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner InputUser= new Scanner(System.in);
        // build a simple interest calculator

        System.out.println("simple intrest calculator");
        System.out.println("enter principal amount :");
        int principal= InputUser.nextInt();
        System.out.println("enter prefered rate :");
        float rate= InputUser.nextFloat();
        System.out.println("enter time duration:");
        short time= InputUser.nextShort();
        double intrest= principal*rate*time;
        System.out.println("simple intrest on your investment will be, " + intrest + " click confirm to proceed");
        /**
         System.out.println("welcome, please input withdrwal amout");
         int wrd= InputUser.nextInt();
         int accbal= 5000;
         int remainingbal= accbal-wrd;
         System.out.println("your remaining balance :" + remainingbal +", thank you");
         if(remainingbal<3000){
         System.out.println("insufficent funds");
         }else if(remainingbal>=3000){
         System.out.println("proceed with transaction");
         }else{
         System.out.println("transaction end");}

         */

    }
    }

