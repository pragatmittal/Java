import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        // Place numbers at their correct positions
        while (i < nums.length) {
            int correct = nums[i] - 1; // Find the correct index for nums[i]
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct); // Swap the numbers to their correct positions
            } else {
                i++; // Move to the next index
            }
        }

        // Collect duplicates
        List<Integer> duplicates = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]); // Add duplicates to the result list
            }
        }

        return duplicates;
    }

    // Helper method to swap elements in the array
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray solution = new FindAllDuplicatesInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution.findDuplicates(nums)); // Output: [2, 3]
    }
}
