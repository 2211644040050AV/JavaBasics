public class EvenOrOdd {
    public static void Even_Or_odd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        Even_Or_odd(3);
        Even_Or_odd(6);
    }
}