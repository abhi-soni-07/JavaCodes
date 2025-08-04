import javax.sound.midi.Soundbank;
import java.util.*;
public class PrimeNo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

}
