import java.util.Arrays;

public class LeetCode1790 {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            int[] S1 = new int[26];
            int[] S2 = new int[26];
            int count = 0;
            for(int i = 0; i < s1.length(); i++) {
                char a = s1.charAt(i);
                char b = s2.charAt(i);
                if(a != b) {
                    count++;
                }
                if(count > 2) {
                    return false;
                }
                S1[a - 'a']++;
                S2[b - 'a']++;
            }
            return Arrays.equals(S1, S2);
        }
    }
} 