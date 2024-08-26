import java.util.Scanner;

public class largeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first integer number : ");
        int a = sc.nextInt();

        System.out.println("Enter your second integer number : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("INVALID! please try again");
        }
        sc.close();
    }
}
