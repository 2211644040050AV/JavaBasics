public class SetIthBit {
    public static int set_Ith_Bit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Count Set Bits in a nimber.
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) { // Check oue LSB
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(set_Ith_Bit(10, 2));
        System.out.println(countSetBit(10));
    }
}