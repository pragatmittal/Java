import java.util.HashMap;

public class SumOfBeautyOfAllSubstrings {
    class Solution {
        public int beautySum(String s) {
            int result = 0;
            for(int i = 0; i < s.length(); i++) {
                HashMap<Character, Integer> map = new HashMap<>();
                for(int j = i; j < s.length(); j++) {
                    char c = s.charAt(j);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    result += getBeauty(map);
                }
            }
            return result;
        }
        
        private int getBeauty(HashMap<Character, Integer> map) {
            int max = 0, min = Integer.MAX_VALUE;
            for(int freq : map.values()) {
                max = Math.max(max, freq);
                min = Math.min(min, freq);
            }
            return max - min;
        }
    }
} 