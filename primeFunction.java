import java.util.*;

public class primeFunction {

    public static boolean isPrime(int num) {
        // only for n>=2
        // corner case
        // 2
        if (num == 2) {
            return true;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) { // completely divide
                return false;
            }
        }
        return true;
    }

    // print prime numbers in reange
    public static void primeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer number : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        primeRange(100); // 2 to 100

        sc.close();
    }
}