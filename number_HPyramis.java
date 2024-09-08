import java.util.Scanner;
// inverted half-pyramid with numbers

public class number_HPyramis {

    public static void IHP_Numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        IHP_Numbers(n);
        sc.close();
    }
}