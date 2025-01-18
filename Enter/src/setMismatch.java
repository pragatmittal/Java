package io.github.jiangdequan;

public class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        // Cyclic sort to place numbers at their correct indices
        while (i < nums.length) {
            int correct = nums[i]; // The correct index for nums[i]
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct); // Swap to place nums[i] at its correct index
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        // If no mismatch is found, the missing number is n
        return nums.length;
    }

    // Helper method to swap two elements in the array
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    }

}