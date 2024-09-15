import java.util.Scanner;

// Palindromic Pattern with Numbers
public class palindromeNumberPat {
    public static void palindrome_Num_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // desecnding numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        palindrome_Num_Pattern(n);
        sc.close();
    }
}