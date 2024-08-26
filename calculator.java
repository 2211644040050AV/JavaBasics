import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        float a = sc.nextFloat();

        System.out.println("Choose Operator : + - * / %");
        char ch = sc.next().charAt(0);

        System.out.println("Enter your second number : ");
        float b = sc.nextFloat();

        switch (ch) {
            case '+':
                float sum = a + b;
                System.out.println("Sum = " + sum);
                break;

            case '-':
                float sub = a - b;
                System.out.println("Subtraction = " + sub);
                break;

            case '*':
                float mul = a * b;
                System.out.println("Mulplication = " + mul);
                break;

            case '/':
                float div = a / b;
                System.out.println("Division = " + div);
                break;

            case '%':
                float mod = a % b;
                System.out.println("Modulus = " + mod);
                break;

            default:
                System.out.println("Invalid choice! please try again");
                break;
        }
        sc.close();
    }
}
