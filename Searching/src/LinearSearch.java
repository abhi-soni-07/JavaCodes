public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={10,30,84,-4,92,34};
        int target=34;
        System.out.println(linear(nums,target));
    }
    static boolean linear(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i< arr.length;i++){

            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
