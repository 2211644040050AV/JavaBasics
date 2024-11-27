public class Backtracking {

    // Find Subsets in a given String
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);

        // no choice
        findSubsets(str, ans, i + 1);
    }

    // Find Permutation in a given String
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" =>"ab" + "de" = "abde"
            String strNew = str.substring(0, i) + str.substring(i + 1);
            findPermutation(strNew, ans + curr);
        }
    }

    /*
     * Grid Ways - Find number of ways to reach from (0,0) to (N -1, M - 1) in a N *
     * N Grid. Allowed moves - right or down
     */
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == n) { // boundry cross condition
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
        /*
         * Note :
         * 1. Right terns = number of columns = m
         * 2. Left terns = number of rows = n
         */
    }

    /* Sudoku - Write a Function to complete a Sudoku. */

    // Calculating Grid
    public static boolean isSafe(int sudko[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudko[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int j = 0; j <= 8; j++) {
            if (sudko[row][j] == digit) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // raversing in row and col of 3 * 3 grid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean SudokuSolver(int sudko[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }

        // recusion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // already ste elements
        if (sudko[row][col] != 0) {
            return SudokuSolver(sudko, nextRow, nextCol);
        }

        // placing elements in new cells
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudko, row, col, digit)) {
                sudko[row][col] = digit;
                if (SudokuSolver(sudko, nextRow, nextCol)) { // solution exits
                    return true;
                }
                sudko[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoko(int sudko[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // String str = "abc";
        // findSubsets(str, "", 0);
        // findPermutation(str, "");

        // int n = 3, m = 3;
        // System.out.println(gridWays(0, 0, n, m));

        int sudko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (SudokuSolver(sudko, 0, 0)) {
            System.out.println("Solution exits");
            printSudoko(sudko);
        } else {
            System.out.println("Solution does not exits");
        }

    }

}