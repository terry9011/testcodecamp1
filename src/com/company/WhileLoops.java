package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
        Scanner terry= new Scanner(System.in);

        String UserInput = "";
        while (!UserInput.equalsIgnoreCase("testify")){
            System.out.println("welcome , \"try again \" to exit this loop");
            UserInput   =  terry.nextLine();
        }


    }
}
