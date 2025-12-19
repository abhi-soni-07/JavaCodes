//Product of set of nth digit

import java.util.Scanner;

public class SetOfInteger2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int prod=1,rem;
        while(n>0)
        {
            rem=n%10;
            prod=prod*rem;
            n=n/10;
        }
        System.out.println(prod);
    }
}
