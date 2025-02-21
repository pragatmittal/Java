// package io.github.jiangdequan;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
    public List<List<Integer>>ans=new ArrayList<>();
    public void helper(int[] candidates,int target,int i ,List<Integer>lst){
        if(target==0){
            ans.add(new ArrayList<>(lst));
            return;
        }
        if(i==candidates.length||target<0){
            return;
        }
        helper(candidates,target,i+1,lst);
        lst.add(candidates[i]);
        helper(candidates,target-candidates[i],i,lst);
        lst.remove(lst.size()-1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper( candidates,target ,0,new ArrayList<>());
        return ans;
    }
}
}