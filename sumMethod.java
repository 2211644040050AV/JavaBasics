import java.util.*;

public class sumMethod {
    public static int sum(int n1, int n2) {
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
        // output of addition of three numbers
        System.out.println("Sum of three number : " + sum(n1, n2, n3));

        sc.close();
    }
}
