import java.util.Scanner;

public class Star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=4;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
