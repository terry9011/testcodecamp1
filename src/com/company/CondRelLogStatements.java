package com.company;

public class CondRelLogStatements {
    public static void main(String[] args) {

        // age qualification
        int myAge = 30;
        int mynumber=50;
        if(mynumber % 3==0) {
            System.out.println("fizz");
        }else if(mynumber % 5== 0){
            System.out.println("buzz");
        }else if (mynumber %5==0  && mynumber % 3==0) {
            System.out.println("FIZZBUZZ");
        }
        else System.out.println("fizzbuzz cannot be applied");



        if(myAge != 30 || myAge<35){
            //System.out.println("not qualified");
        }
        }
       // else if (myAge<=25){
            //System.out.println("qualified");
        }
        //else System.out.println("age not valid");}}




