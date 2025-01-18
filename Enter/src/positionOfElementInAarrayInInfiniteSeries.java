package io.github.jiangdequan;

public class positionOfElementInAarrayInInfiniteSeries {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 15,20, 40, 80, 120}; // Example infinite-like sorted array
        int target = 15;

        int result = searchInfinite(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int searchInfinite(int[] arr, int target) {
        int low = 0;
        int high = 1;

        
        while (arr[high] < target) { 
            low = high;
            high *= 2;
           
        }

        return binarysearch(arr, target, low, high);
    }

    static int binarysearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
 