//Removing duplicate characters

public class RemoveDuplicate1 {
    public static void main(String args[]){
        String s="malayalam";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!temp.contains(c+""))
            {
                temp+=c;
            }
        }
        System.out.println(temp);

    }
}
