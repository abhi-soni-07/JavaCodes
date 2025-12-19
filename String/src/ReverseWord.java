public class ReverseWord {
    public static void main(String args[]){
        String s ="Abhishek is a good guy";
        String str[]=s.split(" ");
        String temp=" ";
        for(int i=0;i<str.length;i++)
        {
            temp+=str[i];
            temp+=" ";
        }
        int i=0;
        int j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j)
        {
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        System.out.println(temp);
    }
}