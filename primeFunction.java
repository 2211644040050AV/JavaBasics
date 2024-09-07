import java.util.*;

public class primeFunction {

    public static boolean isPrime(int num) {
        // Corner case: numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Special case for 2 (which is prime)
        if (num == 2) {
            return true;
        }

        // Check for prime from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // completely divides
                return false;
            }
        }
        return true;
    }

    // Print prime numbers in a range
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

        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        primeRange(100); // Prints prime numbers from 2 to 100

        sc.close();
    }
}
