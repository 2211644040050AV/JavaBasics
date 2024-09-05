
// decimal to binary number
import java.util.*;

public class DtoB {

    public static void DecToBin(int num) {
        int myNum = num;
        int pow = 0;
        int binNum = 0;

        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.println("Binary form of " + myNum + " + " + binNum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer number : ");
        int num = sc.nextInt();

        DecToBin(num);

        sc.close();
    }
}