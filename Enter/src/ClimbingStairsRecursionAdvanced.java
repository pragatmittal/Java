package io.github.jiangdequan;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsRecursionAdvanced {
     class Solution {
        Map<Integer,Integer>cache=new HashMap<>();

    public int climbStairs(int n) {
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }
        if(cache.get(n)!=null){
            return cache.get(n);
        }
        int ans=climbStairs(n-1)+climbStairs(n-2);
    cache.put(n,ans);
        return ans;
        
    }
}
}