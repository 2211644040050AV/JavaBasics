import java.util.Scanner;

public class Recursion {

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
        ;
    }

    public static int factorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int result = factorial(number);

        // System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }
}
