import java.util.*;

public class foodChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("Press 1 for Burger");
        System.out.println("Press 2 for Samosa");
        System.out.println("Press 3 for Momoes");
        System.out.println("Press 4 for exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chossen Burger");
                break;

            case 2:
                System.out.println("You chossen Samosa");
                break;

            case 3:
                System.out.println("You chossen Momoes");
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice! Please try again");
                break;
        }
        sc.close();
    }
}
