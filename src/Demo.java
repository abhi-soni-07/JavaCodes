//Static and Non-Static and blocks
public class Demo {
    static int j=100;
    {
        j=1000;
    }
    int k=200;
    {
        j=20;

    }
    public static void main(String[] args) {
        System.out.println(Demo.j);
        Demo d=new Demo();
        System.out.println(d.k);
        System.out.println(Demo.j);
    }
}
