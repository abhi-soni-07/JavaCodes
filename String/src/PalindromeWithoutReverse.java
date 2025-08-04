public class PalindromeWithoutReverse {
    public static void main(String args[]){
       String s="malayalam";
       char ch[]=s.toCharArray();
       int i=0;
       int j=ch.length-1;
       while(i<j)
       {
           if(!(ch[i]+"").equals((ch[j]+""))){
               System.out.println("Not Palindrome");
           }
           i++;
           j--;
       }
        System.out.println("Palindrome");
    }
}
