package io.github.jiangdequan;

public class 1800. Maximum Ascending Subarray Sum {
    class Solution {
        public int maxAscendingSum(int[] nums) {
         int currmax=nums[0];
         int ans=nums[0];
         for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currmax+=nums[i];
            }
            else{
                currmax=nums[i];
            }
            ans=Math.max(ans,currmax);
    
         }  
         return ans; 
        }
    }
}