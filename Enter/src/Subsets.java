// package io.github.jiangdequan;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> temp, int[] nums, int n) {
        ans.add(new ArrayList<>(temp)); // Add the current subset to the result list
        for (int i = n; i < nums.length; i++) {
            temp.add(nums[i]); // Add the current element to the subset
            helper(ans, temp, nums, i + 1); // Recurse with the next element
            temp.remove(temp.size() - 1); // Backtrack to explore other subsets
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
}

}