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

    // WAF to Find the first occurance of an element in an array
    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    // WAF to Find the last occurance of an element in an array
    public static int lastOccurance(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurance(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    // power of x ^ n
    public static int powerOfN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerOfN(x, n - 1);
    }

    // Print x ^ n in O(log n)
    public static int optimizedPower(int a, int n) {
        if (n == 0) { // base case
            return 1;
        }
        // n is wvwn
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSqr = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSqr = a * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    public static void main(String[] args) {
        // int n = 25;
        // printInc(n);
        // System.out.println(fibonacci(n));
        // int arr[] = { 1, 2, 3, 4 };// isSortedArr(arr, 0);
        // System.out.println(isSortedArr(arr, 0));
        // int[] arr = { 5, 5, 5, 5 };
        // System.out.println(lastOccurance(arr, 5, 0));

        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a, n));

        Scanner scanner = new Scanner(System.in);

        // System.out.println(powerOfN(2, 10));

        // // System.out.print("Enter a number: ");
        // // int number = scanner.nextInt();

        // // int result = factorial(number);

        // // System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }
}
