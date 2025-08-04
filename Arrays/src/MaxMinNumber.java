//Maximum and minimum number from array

public class MaxMinNumber {
    public static void main(String[] args) {
        int a[]={6,4,8,3,1};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){                   //for min if(min>a[i])
                max=a[i];
            }
        }
        System.out.println("Maximum is :"+max);
    }
}
