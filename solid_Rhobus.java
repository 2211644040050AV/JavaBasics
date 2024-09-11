import java.util.Scanner;

// Solid Rhombus
public class solid_Rhobus {
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();
        rhombus(n);
        sc.close();
    }
}