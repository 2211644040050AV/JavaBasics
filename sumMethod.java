import java.util.*;

public class sumMethod {
    // method to calculate two integer sum
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    // method to calculate two float sum
    public static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter your second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter your third number : ");
        int n3 = sc.nextInt();

        // output of addition of two numbers
        System.out.println("Sum of first two numbers : " + sum(n1, n2));
        // output of addition of two float numbers
        System.out.println("Sum of two float numbers : " + sum(15.6f, 4.2f));
        // output of addition of three numbers
        System.out.println("Sum of three number : " + sum(n1, n2, n3));

        sc.close();
    }
}
