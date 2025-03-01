package io.github.jiangdequan;

public class ArrayOperationInAArray {
    class Solution {
        public int[] applyOperations(int[] nums) {
            int n = nums.length;
            
            // Step 1: Apply the given operations
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2;
                    nums[i + 1] = 0;
                }
            }
            
            // Step 2: Move all zeros to the end
            int index = 0; // Pointer for non-zero elements
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    index++;
                }
            }
    
            return nums;
        }
    }
    
}