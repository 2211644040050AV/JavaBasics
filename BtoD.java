import java.util.Scanner;

public class BtoD {
    public static void binToDec(int binNum) {
        int power = 0;
        int decNum = 0;
        int originalBinNum = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + originalBinNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();
        binToDec(binNum);

        sc.close();
    }
}
