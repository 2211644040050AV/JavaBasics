public class insertionSort {
    // insertion sort - pick an element(from unsorted part) & place in the right
    // position in the sorted part
    public static void insertion_Sort(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            int curr = Arr[i];
            int prev = i - 1;
            // finding out the current position to insert
            while (prev >= 0 && Arr[prev] > curr) {
                Arr[prev + 1] = Arr[prev];
                prev--;
            }
            // insertion
            Arr[prev + 1] = curr;
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
        insertion_Sort(Arr);
        printArr(Arr);
    }
}