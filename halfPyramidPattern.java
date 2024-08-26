import java.util.*;

public class halfPyramidPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number which you want to print the pyramid : ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                // print number
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
