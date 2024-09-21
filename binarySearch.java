// import java.util.Scanner;

public class binarySearch {
    public static int Binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int numbers[] = { 5, 1, 3, 8, 4, 6, 2, 9, 10, 0, 7, 8 };
        // System.out.print("Enter the value of key which you wants to search : ");
        int key = 10;
        System.out.println("Index for key is : " + Binary_Search(numbers, key));
        // sc.close();
    }
}