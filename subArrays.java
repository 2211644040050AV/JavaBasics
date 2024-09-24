public class subArrays {
    public static void Print_SubArr(int Arr[]) {

        for (int i = 0; i < Arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < Arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(Arr[k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Arr[] = { 2, 4, 6, 8, 10 };
        Print_SubArr(Arr);
    }
}
