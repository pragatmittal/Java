package io.github.jiangdequan;

public class Ceil {
    public static void main(String[] args) { // Fixed main method declaration
        int[] arr = {1, 2, 3, 5, 6, 8, 10}; // Added array initialization
        int target = 8;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    static int ceil(int[] arr, int target) { // Fixed parameter format
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Fixed mid calculation
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid; // Found the exact element
            }
        }
        return start; // Returns the index of the smallest element greater than or equal to the target
    }
}
