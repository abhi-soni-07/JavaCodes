//Second largest and smallest number

public class SecondLargest {
    public static void main(String[] args) {
        int a[]={4,8,3,6,2};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){                  //for second smallest if(a[i]>a[j])
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }
        }
        System.out.println("Second Largest number is "+a[1]);
    }
}
