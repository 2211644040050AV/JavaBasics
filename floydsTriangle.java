import java.util.Scanner;
// Floyd's Triangle

public class floydsTriangle {
    public static void floyds_Triangle(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner - how many times will counter be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        floyds_Triangle(n);
        sc.close();
    }
}
