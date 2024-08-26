import java.util.*;

public class taxCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your annual income : ");
        float income = sc.nextFloat();

        float tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("Final cross checked budget : " + income);
        } else if (income > 500000 && income < 1000000) {
            // tax = 20%;
            tax = (int) (income * 0.2);
            System.out.println("Tax : " + tax);
        } else {
            tax = (int) (income * 0.3);
            System.out.println("Tax : " + tax);
        }
        sc.close();
    }
}
