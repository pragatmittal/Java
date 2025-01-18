package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    
  
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
    
            // Place numbers at their correct positions
            while (i < nums.length) {
                int correct = nums[i] - 1; // Find the correct index for the current number
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct); // Pass indices, not values
                } else {
                    i++;
                }
            }
    
            // Find all indices where the numbers are not correct
            List<Integer> ans = new ArrayList<>();
            for (int ii = 0; ii < nums.length; ii++) {
                if (nums[ii] != ii + 1) {
                    ans.add(ii + 1); // Add missing numbers
                }
            }
    
            return ans;
        }
    
        // Swap function to swap elements in the array
        static void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
    
}