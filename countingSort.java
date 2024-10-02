public class countingSort {
    public static void counting_Sort(int Arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < Arr.length; i++) {
            largest = Math.max(largest, Arr[i]);
        }
        int[] count = new int[largest + 1];
        for (int i = 0; i < Arr.length; i++) {
            count[Arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < Arr.length; i++) {
            while (count[i] > 0) {
                Arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int Arr[]) {

        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] Arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting_Sort(Arr);
        printArr(Arr);
    }
}