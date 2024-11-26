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

    public static void main(String[] args) {
        // String str = "abc";
        // findSubsets(str, "", 0);
        // findPermutation(str, "");

        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }

}