public class DiagonalStar1 {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i>=2 && j<i)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
