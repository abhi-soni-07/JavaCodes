import java.util.*;
public class NivenNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=n,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(temp%sum==0)
        {
            System.out.println("Niven Number");
        }
        else {
            System.out.println("Not a Niven Number");
        }
    }
}
