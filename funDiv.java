import java.util.*;

public class funDiv {

    public static int div(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int y = sc.nextInt();

        System.out.println("Divide = " + div(x, y));

        sc.close();
    }
}