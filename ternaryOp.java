import java.util.*;

public class ternaryOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int number = sc.nextInt();

        String str = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(str);
        sc.close();
    }

}