public class DiagonalStar2 {
    public static void main(String args[])
    {
        int n=4;
        for (int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                if(i<=3 && j>i )
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
