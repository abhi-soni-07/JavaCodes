//All  methods are same in StringBuffer and StringBuilder
//insert(),delete(),deleteCharAt(),ensureCapacity(),toString(),capacity(),replace()
//charAt(),indexOf(),lastIndexOf(),substring(),subSequence(),append(),reverse()


public class StringBufferBuilder {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Abhishek");
        sb.length();
        sb.append(" Soni");
        System.out.println(sb.capacity());          //16
        sb.append(" Soni abhish");
        System.out.println(sb.capacity());          //34 ----->  (16*2)+2

        System.out.println(sb.reverse());



    }

}
