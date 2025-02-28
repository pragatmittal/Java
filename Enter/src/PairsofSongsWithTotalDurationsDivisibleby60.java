package io.github.jiangdequan;

import java.util.HashMap;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int count = 0;
            HashMap<Integer, Integer> mapping = new HashMap<>();
    
            for (int i=0;i<time.length;i++) {
                int t=time[i];
                if (t % 60 == 0) {
                    count += mapping.getOrDefault(0, 0);
                } else {
                    count += mapping.getOrDefault(60 - t % 60, 0);
                }
                mapping.put(t % 60, mapping.getOrDefault(t % 60, 0) + 1);
            }
            return count;
        }
    }
    
}