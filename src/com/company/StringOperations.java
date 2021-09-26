package com.company;

public class StringOperations {
    public static void main(String[] args) {
        String word= "unIVERsity";
        String rule = "DEMOCRACY";

        //Write a code to reverse the string DEMOCRACY and get the word COME out of it.
        StringBuilder rule1= new StringBuilder(rule);
        rule1.append(rule);
        rule1.reverse();
        System.out.println(rule1);
        System.out.println(rule1.substring(4,8));

        /**
         //uppercas&lowercase
         System.out.println(word.toLowerCase());
         System.out.println(word.toUpperCase());
         // lenth of word
         System.out.println(word.length());
         //index of a character
         System.out.println(word.indexOf("s"));
         //character at an index
         System.out.println(word.charAt(4));
         //spliting a word
         System.out.println(word.substring(0,3));
         //System.out.println(word.charAt(word.length()-1-2));
         //System.out.println(word.substring(-1,-10));

         */






    }
}
