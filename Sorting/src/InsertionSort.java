public class InsertionSort {
    public static void main(String args[]){
        int a[]={7,4,8,3,9,2};
        sort(a);
        for(int n:a)
        System.out.println(n+" ");
    }
    public static void sort(int a[]){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i;
            while(j>0 && a[j-1]>key){
                        a[j]=j-1;
                        j--;
            }
            a[j]=key;
        }
    }
}
