//Factorial and ProductOfDigit is almost similar, here just need to add 0 condition.

import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;
        if(n==0)
        {
            System.out.println(fact);
            return;
        }
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
