package com.company;

public class ForLoops {
    public static void main(String[] args) {

        //write a loop that prints odd if it is an odd number and a loop that prints even if it is an even number.
        for(int i=0; i<10;i++){
            if (i % 2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");}
        }

        //for i loop
        for (int i=0; i<10 ;i++){
            //System.out.println("student:" + i);
        }
        for(int i=10; i>5 ;i--){
            //System.out.println("student:" + i);
        }
        //for each loop
        String [] fruits ={"mango","orange","apple"};

        for(String vName : fruits);{
            //System.out.println( vName );
        }
    }

}
