package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        //create a two dimensional array with 4 rows and 3 colums.Fill only the first colum with any fruits of ur choice
        String[][] FRUITS= new String[4][3];

        FRUITS [0][0]="apple";
        FRUITS [1][0]="orange";
        FRUITS [2][0]="mango";
        FRUITS [3][0]="pear";
        System.out.println(Arrays.deepToString(FRUITS));


        /**
         int[] array1= new int[5];
         array1[0]= 2;
         array1[1]=5;
         array1[4]=6;
         //System.out.println(Arrays.toString(array1));

         String[] fruits= {"mango", "orange","apple"};
         //System.out.println(Arrays.toString(fruits));
         int [] [] doubledimA= new int [3][3];
         doubledimA[0] [0]=20;
         doubledimA[0][1]=30;
         doubledimA[2][1]=45;
         //System.out.println(Arrays.deepToString(doubledimA));

         //ArrayList
         ArrayList arr= new ArrayList();
         arr.add("test");
         arr.add("15");
         arr.add("pen");
         System.out.println(arr);

         */


    }


}
