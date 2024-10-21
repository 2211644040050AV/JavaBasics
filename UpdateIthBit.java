public class UpdateIthBit {

    public static int set_Ith_Bit(int var0, int var1) {
        int var2 = 1 << var1;
        return var0 | var2;
    }

    public static int clear_Ith_Bit(int var0, int var1) {
        int var2 = ~(1 << var1);
        return var0 & var2;
    }

    public static int UpdIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear_Ith_Bit(n, i);
        } else {
            return set_Ith_Bit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(UpdIthBit(10, 2, 1));
    }
}
