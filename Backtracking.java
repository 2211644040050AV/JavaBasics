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

    public static void main(String[] args) {
        String str = "abc";
        // findSubsets(str, "", 0);
        findPermutation(str, "");
    }

}