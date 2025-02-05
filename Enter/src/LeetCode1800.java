public class LeetCode1800 {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int currmax = nums[0];
            int ans = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i-1] < nums[i]) {
                    currmax += nums[i];
                } else {
                    currmax = nums[i];
                }
                ans = Math.max(ans, currmax);
            }  
            return ans; 
        }
    }
} 