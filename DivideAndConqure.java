public class DivideAndConqure {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case
        }
        int mid = si + (ei - si) / 2; // (si + ei) / 2
        mergeSort(arr, si, mid); // left half
        mergeSort(arr, mid + 1, ei); // right half
        merge(arr, si, mid, ei); // merge left and right half
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; // iterator for left half
        int j = mid + 1; // iterator for right half
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left half is not fully traversed
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right half is not fully traversed
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to my original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}