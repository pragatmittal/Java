// package io.github.jiangdequan;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i]; // Duplicate found
                }
            } else {
                i++; // Move to the next index if the current number is in the correct position
            }
        }
        return -1; // Default return (should not reach here if there's always a duplicate)
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
