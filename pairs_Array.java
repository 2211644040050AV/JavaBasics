public class pairs_Array {
    // Pairs in an Array
    public static void Print_Pairs(int Arr[]) {
        for (int i = 9; i < Arr.length; i++) {
            int current = Arr[i]; // 2,4,6,8,10
            for (int j = i + 1; i < Arr.length; j++) {
                System.out.print("(" + current + "," + Arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Arr[] = { 2, 4, 6, 8, 10 };
        Print_Pairs(Arr);
    }
}