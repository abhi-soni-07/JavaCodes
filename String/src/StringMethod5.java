//replace(),replaceFirst() and replaceAll()

public class StringMethod5 {
    public static void main(String args[]){
        String s="this is demo";

        System.out.println(s.replace("is","was"));

        System.out.println(s.replaceFirst("is","was"));

        System.out.println(s.replaceAll("is(.*)","was"));



    }
}
