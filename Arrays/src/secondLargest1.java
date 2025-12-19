public class secondLargest1 {
    public static void main(String[] args) {
       int arr[]={43,20,12,44,23,55,65};
       int largest=0;
       int secondLargest=0;
       for(int i : arr){
           if(i>largest){
               secondLargest=largest;
               largest=i;
           }
           else if (i>secondLargest){
               secondLargest=i;
           }
       }
        System.out.println(secondLargest);
    }
}
