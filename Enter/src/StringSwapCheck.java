import java.util.Arrays;

public class StringSwapCheck {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            if (s1.equals(s2)) return true;
            
            char[] S1 = s1.toCharArray();
            char[] S2 = s2.toCharArray();
            
            int diff = 0;
            int[] pos = new int[2];
            
            for (int i = 0; i < S1.length; i++) {
                if (S1[i] != S2[i]) {
                    if (diff >= 2) return false;
                    pos[diff++] = i;
                }
            }
            
            if (diff != 2) return false;
            
            char temp = S1[pos[0]];
            S1[pos[0]] = S1[pos[1]];
            S1[pos[1]] = temp;
            
            return Arrays.equals(S1, S2);
        }
    }
} 