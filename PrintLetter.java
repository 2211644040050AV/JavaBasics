import java.util.Scanner;

public class PrintLetter {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        printLetter(str);
        sc.close();
    }
}