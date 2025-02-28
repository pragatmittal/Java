// package io.github.jiangdequan;

public class MaxAbsSubArraySum {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            int n = nums.length;
            int currSum = nums[0];
            int maxSum = nums[0];
    
            // Finding max subarray sum
            for (int i = 1; i < n; i++) {
                currSum = Math.max(nums[i], nums[i] + currSum);
                maxSum = Math.max(maxSum, currSum);
            }
            int subSum = nums[0];
            int minSum = nums[0];
    
            // Finding min subarray sum
            for (int i = 1; i < n; i++) {
                subSum = Math.min(nums[i], nums[i] + subSum);
                minSum = Math.min(minSum, subSum);
            }
    
            return Math.max(maxSum, Math.abs(minSum));
        }
    }
    
}