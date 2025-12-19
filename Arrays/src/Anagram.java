import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="rat";
        String s2="car";
        if(isAnagram(s1,s2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        else{
            return false;
        }
    }
}
