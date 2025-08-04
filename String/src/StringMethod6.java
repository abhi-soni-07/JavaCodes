//Searching related method -- //indexOf(),lastIndexOF(),charAt(),contains(),startsWith() and endsWith()

public class StringMethod6 {
    public static void main(String args[]){
        String s="this is Demo";
        System.out.println(s.indexOf("s"));             //3

        System.out.println(s.lastIndexOf("s"));     //6

        System.out.println(s.charAt(5));                //i

        System.out.println(s.contains("e"));            //True

        System.out.println(s.startsWith("this"));       //True

        System.out.println(s.endsWith("Demo"));         //True
    }
}
