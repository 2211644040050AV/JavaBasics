public class ClearLastIthBit {
    public static int clear_Last_Ith_Bit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_Last_Ith_Bit(15, 2));
    }
}
