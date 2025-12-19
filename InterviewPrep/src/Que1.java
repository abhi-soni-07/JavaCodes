public class Que1 {
    public static void main(String[] args) {
        int max=2800;

        int note1000= max/1000;
        max=max%1000;

        int note500=max/500;
        max=max%500;

        int note100=max/100;

        System.out.println(note1000);
        System.out.println(note500);
        System.out.println(note100);
    }
}
