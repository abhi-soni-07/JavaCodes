//Reverse without charAt() method.
//by using swapping

import java.util.*;
public class ReverseString1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char [] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        System.out.println(ch);
    }
}
