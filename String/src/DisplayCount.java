//Display Count of Alphabets, special characters and numbers
import java.util.*;
public class DisplayCount {
    public static void main(String args[]){
       String s="hello1234@#$%^";
       int alphabet=0,number=0,specialCharacter=0;
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if((c>='A' && c<='Z')||(c>='a' && c<='z')){
               alphabet++;
           } else if (c>='0' && c<='9') {
               number++;
           }
           else {
               specialCharacter++;
           }
       }
        System.out.println("Total alphabets "+alphabet);
        System.out.println("Total number "+number);
        System.out.println("Total Special Character "+specialCharacter);
    }
}
