//Array without name. After performing once, no use later.
//1D,2D,3D,...can work

public class AnonymousArray {
    public static void main(String[] args) {
        sum(new int[]{10,20,20});       //new int[][]{{10,20,30},{40,50}}
    }
    static void sum(int []n) {         //(int[][] n)
        int total=0;
        for(int i:n)                   //for(int ii[]:n){
        {                               //for(int i:ii)
            total+=i;
        }
        System.out.println(total);
    }
}
