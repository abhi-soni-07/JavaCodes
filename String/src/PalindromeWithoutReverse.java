public class PalindromeWithoutReverse {
    public static void main(String args[]){
       String str = "madam";
       char ch[]=str.toCharArray();
       int i=0;
       int j= ch.length-1;
       while(i<j){
           if(!((ch[i]+"").equals(ch[j]+""))){
               System.out.println("Not Palindrome");
               return;
           }
           i++;
           j--;
       }
       System.out.println("Palindorme");
    }
}
