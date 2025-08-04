import java.util.*;
public class StrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=n,rem;
        while(n>0)
        {
            rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}
