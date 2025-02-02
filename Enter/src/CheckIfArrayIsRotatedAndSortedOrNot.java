package io.github.jiangdequan;

public class CheckIfArrayIsRotatedAndSortedOrNot {
    class Solution {
        public boolean check(int[] nums) {
            int index = -1;
    
            // Find the rotation point
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i + 1]) {
                    index = i;
                    break;
                }
            }
    
            // If no rotation point is found, the array is sorted
            if(index == -1) {
                return true;
            }
    
            // Check if the array is sorted after the rotation point
            for(int i = index + 1; i < nums.length - 1; i++) {
                if(nums[i] > nums[i + 1]) { // Compare each adjacent pair
                    return false;
                }
            }
    
            // Check if the last element is greater than or equal to the first element
            // This ensures the array wraps around correctly
            if(nums[nums.length - 1] > nums[0]) {
                return false;
            }
    
            return true;
        }
    }
}