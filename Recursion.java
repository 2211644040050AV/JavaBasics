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

    // sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    // Fibonacci Number
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Array Sorting
    public static boolean isSortedArr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSortedArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int n = 25;
        // printInc(n);
        // System.out.println(fibonacci(n));
        int arr[] = { 1, 2, 3, 4 };// isSortedArr(arr, 0);
        System.out.println(isSortedArr(arr, 0));
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int result = factorial(number);

        // System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }
}
