public class DivideAndConquer {
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

    // Quick Sort - Pivot & Partition
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for e;s smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Sqap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Sqap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}