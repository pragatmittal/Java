package io.github.jiangdequan;

import java.util.HashMap;

public class TuplewithSameProduct {
    class Solution {
        public int tupleSameProduct(int[] nums) {
            int count=0;
            
            HashMap<Integer,Integer>mapping=new HashMap<>();
    
            for(int i=0;i<nums.length;i++){
               for(int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                if(mapping.containsKey(product)){
                    int freq=mapping.get(product);
    
                    count+=8*freq;
    
                }
                mapping.put(product,mapping.getOrDefault(product,0)+1);
               }
            }
            return count;
        }
    }
}