import java.util.*;

public class funSub {

    public static int sub(int a, int b, int c) {

        return a - b - c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int y = sc.nextInt();

        System.out.print("Enter the value of c : ");
        int z = sc.nextInt();

        System.out.println("Substract = " + sub(x, y, z));

        sc.close();
    }
}
