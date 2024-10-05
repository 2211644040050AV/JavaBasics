import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // This exception will never be hit if the problem guarantees a solution
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method to run the program
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test case
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        // Call twoSum and print the result
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
