import java.util.Scanner;

public class binaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float a = sc.nextFloat();

        System.out.print("Enter your second number : ");
        float b = sc.nextFloat();

        // Perform float addition
        float floatSum = a + b;
        System.out.println("Sum as float = " + floatSum);

        // Perform integer addition
        int intSum = (int) a + (int) b;
        System.out.println("Sum as integer = " + intSum);

        // Perform float subtract
        float floatSub = a - b;
        System.out.println("Subtraction as float = " + floatSub);

        // Perform integer subtract
        int intSub = (int) a - (int) b;
        System.out.println("Subtraction as integer = " + intSub);

        // Perform float multiplication
        float floatMult = a * b;
        System.out.println("Mutliplication as float = " + floatMult);

        // Perform integer multiplication
        int intMult = (int) a * (int) b;
        System.out.println("Multiplication as integer = " + intMult);

        // Perform float addition
        float floatDiv = a / b;
        System.out.println("Divide as float = " + floatDiv);

        // Perform integer addition
        int intDiv = (int) a / (int) b;
        System.out.println("Divide as integer = " + intDiv);

        // Perform float modulus
        float floatMod = a % b;
        System.out.println("Sum as float = " + floatMod);

        // Perform integer modulus
        int intMod = (int) a + (int) b;
        System.out.println("Sum as integer = " + intMod);

        sc.close();

    }
}