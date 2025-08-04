public class Calculator1 {
    public static void main(String args[]){

        add(10,20);
        sub(20,10);
        mul(10,10);
        div(200,10);


    }
    public static void add(int a, int b){
        System.out.println("Addition of a and b is = "+(a+b));
    }
    public static void sub(int a,int b){
        System.out.println("Subtraction of a and b is = "+(a-b));
    }
    public static void mul(int a,int b) {
        System.out.println("Multiplication of a and b is = " + (a*b));
    }
    public static void div(int a,int b) {
        System.out.println("Division of a and b is = " + (a/b));
    }
}
