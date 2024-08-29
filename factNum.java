import java.util.*;

public class factNum {

    public static int factorial(int fact) {
        int f = 1;
        for (int i = 1; i <= fact; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number for calculating the factorial : ");
        int fact = sc.nextInt();

        System.out.println("Factorial of " + fact + " is : " + factorial(fact));

        sc.close();
    }
}
