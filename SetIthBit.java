public class SetIthBit {
    public static int set_Ith_Bit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(set_Ith_Bit(10, 2));
    }
}