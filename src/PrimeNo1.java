//Prime no from 1 to 100 with intervals of positions
import java.util.*;
public class PrimeNo1 {
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int pos=0;
        for(int i=1;i<=no;i++)
        {
            int temp=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0)
            {
                pos++;
                if(pos%2==0) {
                    System.out.println(i);
                }
            }
        }
    }

}
