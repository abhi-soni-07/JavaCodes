public class UpperLowerCase {
    public static void main(String args[]) {
       String s="KaTaPpA";
       String temp="";
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c>='A'&& c<='Z'){
               temp+=(char)(c+32);
           }
           else if(c>='a' && c<='z')
               temp+=(char)(c-32);
           }
           System.out.print(temp);
       }
    }

