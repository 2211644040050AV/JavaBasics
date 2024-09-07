import java.util.*;
// Invert & Rotated Half-Pyramid

public class IRH_Pyramid {

    public static void IRH_Prmd(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int n = sc.nextInt();
        IRH_Prmd(n);
        sc.close();
    }
}