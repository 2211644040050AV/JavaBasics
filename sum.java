import java.util.*;

public class sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("Sum = " + sum);
        sc.close();
    }

}