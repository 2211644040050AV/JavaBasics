import java.util.*;

public class characterPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number which you want to print the alphabet series : ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
