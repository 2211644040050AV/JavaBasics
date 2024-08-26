import java.util.*;

public class break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // By using break ketword
        // do {

        // System.out.println("Enter any number : ");
        // int num = sc.nextInt();

        // if (num % 10 == 0) {
        // break;
        // }

        // System.out.print(num);
        // } while (true);

        // By using Continue ketword
        do {

            System.out.println("Enter any number : ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                continue;
            }

            System.out.println("Number was : " + num);
        } while (true);
    }
}
