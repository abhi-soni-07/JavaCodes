//Sum of nth digit
import java.util.*;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of nth digit is "+sum);
    }
}
