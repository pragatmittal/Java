package io.github.jiangdequan;

public class GasStationOptimised {
    class Solution {
        class Solution {
            public int canCompleteCircuit(int[] gas, int[] cost) {
                int totalGas = 0, totalCost = 0, start = 0, fuel = 0;
                int n = gas.length;
        
                for (int i = 0; i < n; i++) {
                    totalGas += gas[i];
                    totalCost += cost[i];
                    fuel += gas[i] - cost[i];
        
                    if (fuel < 0) {
                        start = i + 1;
                        fuel = 0;
                    }
                }
        
                return (totalGas >= totalCost) ? start : -1;
            }
        }
        
    }
}