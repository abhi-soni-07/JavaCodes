// + operator, concat, join

public class StringMethod3 {
        public static void main(String args[]){
            String s1="Abhishek";
            String s2=" soni";
            String s3="sdfghn";
            System.out.println(s1+s2);      //Abhishek soni
            System.out.println(s1+10);      //Abhishek10
            System.out.println(s1+10+20);   //Abhishek1020
            System.out.println(10+20+s2);   //30 soni
            System.out.println(10+s2+30);   //10 soni30
            System.out.println(s1+20/10);   //Abhishek2
           // System.out.println(s1+20-10);   It will give error due to -
            System.out.println(s2+10*2);    // soni20

            System.out.println(s1.concat(s2));  //Abhishek soni

            System.out.println(String.join(";",s1,s2,s3)); //join is static method
        }

}
