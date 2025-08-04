import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (Isautomorphic(n)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }

    public static boolean Isautomorphic(int n) {
        int sq = n * n;

        while (n > 0) {
            if (n % 10 != sq % 10) {
                return false;
            } else {
                n = n / 10;
                sq = sq / 10;
            }
        }
        return true;
    }
}



