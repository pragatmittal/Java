
public class NumberOfSubArraysWithOddSum {
    class Solution {
        public int numOfSubarrays(int[] arr) {
            int MOD = 1000000007;
            int count = 0, odd = 0, even = 1, sum = 0;
    //considering even=1 because initially sum=0 i.e. by defaut  it is even.
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
    
                if (sum % 2 == 0) {
                    count = (count + odd) % MOD;
                    even++;
                } else {
                    count = (count + even) % MOD;
                    odd++;
                }
            }
    
            return count;
        }
    }
    
}