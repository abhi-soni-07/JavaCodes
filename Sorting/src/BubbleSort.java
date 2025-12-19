public class BubbleSort {
    public static void main(String args[]) {
        int a[]={10,40,70,20,50,30};
        sort(a);
        for(int n:a)
            System.out.print(n+" ");

    }
    static void sort(int a[]){
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
