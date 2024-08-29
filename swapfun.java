import java.util.*;

public class swapfun {

    public static void swap(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("Your first number after swapping : " + n1);
        System.out.println("Your first number after swapping : " + n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first value : ");
        int n1 = sc.nextInt();

        System.out.println("Enter your second value : ");
        int n2 = sc.nextInt();

        swap(n1, n2);

        sc.close();
    }
}