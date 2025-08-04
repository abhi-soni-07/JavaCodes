//Case Conversion toUpperCase() and toLowerCase()
//Type Conversion valueOf() and toCharArray()

import java.util.Scanner;

public class StringMethod7 {
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
        String s="Abhishek";

        System.out.println(s.toUpperCase());    //ABHISHEK

        System.out.println(s.toLowerCase());     //abhishek

        //===========================================

        int a=10,b=20;
        System.out.println(a+b);
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2);          //Returns value in form of String

        char c[]=s.toCharArray();
        System.out.println(c);              //Returns value in form of Char
    }
}
