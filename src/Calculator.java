import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("1 for Addition:\n 2 for Subtraction:\n 3 for Multiplication:\n 4 for Division:\n Please Enter your choice:");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Addition is " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is " + (a * b));
                break;
            case 4:
                System.out.println("Division is " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}


