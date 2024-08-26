import java.util.Scanner;

public class type {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // type conversion
        // System.out.println("Enter any integer number : ");
        // float a = sc.nextInt();
        // System.out.println("Your entered number after type cpnversion : " + a);

        // type casting
        // System.out.println("Enter any floating number : ");
        // float b = sc.nextFloat();
        // int c = (int) b;
        // System.out.println("Your entered number after type casting : " + c);

        // type conversion of character to int
        char ch = 'b';
        int num = ch;
        System.out.println(num);
        sc.close();
    }
}