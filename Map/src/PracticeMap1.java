//Counting frequency of x

import java.util.HashMap;
import java.util.Map;

public class PracticeMap1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,5,2,2,1};
        Map<Integer,Integer> freq=new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        System.out.println(freq);
    }
}
