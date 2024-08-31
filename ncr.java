import java.util.*;

public class ncr {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bicoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoffee = fact_n / (fact_r * fact_nmr);
        return bincoffee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();

        System.out.println("The binomial coefficient (nCr) is: " + bicoff(n, r));

        sc.close();
    }
}
