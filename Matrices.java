import java.util.*;

public class Matrices {

    public static boolean search(int matrix[][], int n, int m, int key) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Key found at index [" + i + "] [" + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter [" + i + "] [" + j + "] number : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "] [" + j + "]" + " = " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, n, m, 5);

        sc.close();
    }
}