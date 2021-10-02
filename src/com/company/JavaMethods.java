package com.company;

public class JavaMethods{
    public static void main(String[] args) {
        // TO ACCESS THE PROPROPERTIES OFA CLASS CREATE AN OBJECT OF THE CLASS.
        JavaMethods methodvar= new JavaMethods();
        methodvar.printName();
        methodvar.myAge(20);
        methodvar.visitor("TEST");

    }
    public void printName(){
        //System.out.println("my name is terry");
    }
    public void myAge(int age){
        //System.out.println("my age is" + age);

    }
    // TASK 22
    public void visitor(String Training){
        String training = "TESTIFY";
        if(Training.equalsIgnoreCase(training)){
            System.out.println("welcome");
        }else{
            System.out.println("access denied");
        }
    }

}
