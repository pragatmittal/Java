package io.github.jiangdequan;

public class Merge2-2DarraysBySummingValues {
    import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                // If IDs match, sum the values
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                // If nums1 has a smaller ID, add it to the result
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                // If nums2 has a smaller ID, add it to the result
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < nums1.length) {
            list.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }

        // Add remaining elements from nums2
        while (j < nums2.length) {
            list.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        // Convert list to 2D array and return
        return list.toArray(new int[list.size()][]);
    }
}

}