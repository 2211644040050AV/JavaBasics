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

    // Tiling Problem -
    /*
     * Given a "2 * n" board and tiles of size "2 * 1", count the number of ways to
     * tiles the given board using the 2 * 1 tiles. (A tile can either be placed
     * horizontally or vertically.)
     */
    public static int tilingProblem(int n) { // 1 * n (floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    // Remove Duplication in a String
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // Friends Pairing Problem -
    /*
     * Given friends, each one can remain single or can be paired up with some other
     * friend. Each friends pairs can be only once. Find out the total number of
     * ways in which friend can remain single or can be paired up.
     */
    public static int friendsPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        // choice

        // single
        int fnm1 = friendsPairing(n - 1);

        // pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // direct way -
        // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    /*
     * Binary String Problem - Print all binary strings of length/size N without
     * consecutive ones.
     */
    public static void printBinString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // int n = 25;
        // printInc(n);
        // System.out.println(fibonacci(n));
        // int arr[] = { 1, 2, 3, 4 };// isSortedArr(arr, 0);
        // System.out.println(isSortedArr(arr, 0));
        // int[] arr = { 5, 5, 5, 5 };
        // System.out.println(lastOccurance(arr, 5, 0));

        // int a = 2;
        // int n = 10;
        // System.out.println(optimizedPower(a, n));

        // String str = "babu";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        printBinString(3, 0, "");

        // System.out.println(friendsPairing(3));

        // System.out.println(tilingProblem(4));

        Scanner scanner = new Scanner(System.in);

        // System.out.println(powerOfN(2, 10));

        // // System.out.print("Enter a number: ");
        // // int number = scanner.nextInt();

        // // int result = factorial(number);

        // // System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }
}
