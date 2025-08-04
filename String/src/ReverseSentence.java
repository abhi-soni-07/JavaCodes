public class ReverseSentence {
    public static void main(String args[]){
        String s="Abhishek is a good guy";
        String str[]=s.split(" ");
        String temp="";
        for(int i=str.length-1;i>=0;i--)
        {
            temp+=str[i];
            temp+=" ";
        }
        temp=temp.trim();
        System.out.println(temp);
    }
}
