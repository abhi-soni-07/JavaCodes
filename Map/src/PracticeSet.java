//Duplicates using sets

import java.util.HashSet;
import java.util.Set;

public class PracticeSet {
    public static void main(String[] args) {
        int[] arr={1,5,2,1,4,3};
        Set<Integer> set=new HashSet<>();
        for(int x:arr)
        {
            if(set.contains(x)){
                System.out.println("Duplicate valus is : "+x);
            }
            set.add(x);
        }
    }
}
