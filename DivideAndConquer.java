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

    /*
     * Search in Rotated Sorted Array - input : sorted, rotated array with distinct
     * numbers (in assending order) it is rotated at a pivot point. Find the index
     * of element.
     */
    public static int Search(int arr[], int target, int si, int ei) {
        if (si > ei) { // base case
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }
        // mid on Line 1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                // case b : right
                return Search(arr, target, mid + 1, ei);
            }
        }
        // mid on Line 2
        else {
            // case c : right
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                // case d : left
                return Search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0; // output -> 4
        int tarIdx = Search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}