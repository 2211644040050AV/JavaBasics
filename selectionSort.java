public class selectionSort {
    // selection sort - pick the smallest (from unsorted), put it at the begining
    public static void Selection_Sort(int Arr[]) {
        int n = Arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int smallest = turn;
            for (int j = turn + 1; j < n; j++) {
                if (Arr[smallest] > Arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = Arr[smallest];
            Arr[smallest] = Arr[turn];
            Arr[turn] = temp;
        }
    }

    public static void printArr(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int Arr[] = { 5, 4, 1, 3, 2 };
        Selection_Sort(Arr);
        printArr(Arr);
    }
}