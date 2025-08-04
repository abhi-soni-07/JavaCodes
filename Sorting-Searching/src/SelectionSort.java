public class SelectionSort {
    public static void main(String args[]) {
        int a[] = {8, 3, 5, 42, 4, 24};
        sort(a);
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void sort(int a[]){
        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[index]>a[j]) index=j;
            }
            if(i!=index) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
}
