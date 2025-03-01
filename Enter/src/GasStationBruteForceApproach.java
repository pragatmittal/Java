package io.github.jiangdequan;

public class GasStationBruteForceApproach {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
    
            for (int start = 0; start < n; start++) {
                int fuel = 0;
                int count = 0;
                int i = start;
    
                while (count < n) {
                    fuel += gas[i] - cost[i];
                    if (fuel < 0) break; // If fuel goes negative, break and try next start point
    
                    count++;
                    i = (i + 1) % n; // Move to the next station in a circular manner
                }
    
                if (count == n) return start; // If full cycle is completed, return start index
            }
    
            return -1; // If no valid starting station is found
        }
    }
}