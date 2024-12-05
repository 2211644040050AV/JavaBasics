public class ShellSort {

    public static void Shell(int arr[]) {
        int n = arr.length;

        // Start with large gap, tnen reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                // Store the current element
                int temp = arr[i];
                int j;
                /*
                 * Shift earlier gap-sorted elements up until the correct location for arr[i] is
                 * found
                 */
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Place temp (the original arr[i]) at its correct location
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 54, 2, 3 };

        System.out.println("Original Array:");
        printArray(arr);

        Shell(arr);

        System.out.println("Sorted Array:");
        printArray(arr);

    }
}
