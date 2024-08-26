import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your integer number : ");
        int num = sc.nextInt();

        // Print Reverse Of A Number
        // while (num > 0) {
        // int lastDigit = num % 10;
        // System.out.print(lastDigit);
        // num /= 10;
        // }
        // System.out.println();

        // Reverse The Given Number
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num /= 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
