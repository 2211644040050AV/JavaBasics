public class ClearLastIthBit {
    public static int clear_Last_Ith_Bit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Clear Range of Bits
    public static int ClearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(clear_Last_Ith_Bit(15, 2));
        System.out.println(ClearRangeOfBits(10, 2, 4));
    }
}
