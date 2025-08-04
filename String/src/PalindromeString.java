import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String temp=s;
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if (temp.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}
