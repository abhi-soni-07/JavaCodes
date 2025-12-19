public class MergeSort{
    int arr[];
    int tempArr[];
    int length;
        public static void main(String args[]){
            int a[]={3,9,38,1,40,7};
            MergeSort ms=new MergeSort();
            ms.sort(a);
            for(int n:a){
                System.out.print(n+" ");
            }
        }
        public void sort(int a[]){
            this.arr=a;
            this.length=a.length;
            this.tempArr=new int[length];
            divide(0,length-1);
        }
        public void divide(int start, int end){
            if(start<end){
                int mid=start+(end-start)/2;
                divide(start,mid);
                divide(mid+1,end);
                merge(start,mid,end);
            }
        }
        public void merge(int start,int mid,int end){
            for(int i=0;i<=end;i++){
                tempArr[i]=arr[i];
            }
            int i=start;
            int j=mid+1;
            int k=start;
            while(i<=mid && j<=end)
            {
                if(tempArr[i]<=tempArr[j]){
                    arr[k]=tempArr[i];
                    i++;
                }
                else {
                    arr[k]=tempArr[j];
                    j++;
                }
                k++;
            }
            while (i<=mid){
                arr[k]=tempArr[i];
                i++;
                k++;
            }
        }

}