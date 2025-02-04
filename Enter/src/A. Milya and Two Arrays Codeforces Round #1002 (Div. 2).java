package io.github.jiangdequan;

public class A. Milya and Two Arrays Codeforces Round #1002 (Div. 2) {
    import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    // Check if an array is "good": each distinct element must appear at least twice.
    public static boolean isGood(int[] arr) {
        // Since arr is already sorted, count consecutive equal elements.
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count < 2) {
                    return false; // Previous element did not appear at least twice.
                }
                count = 1; // Reset count for the new element.
            }
        }
        // Check for the last group of elements.
        return count >= 2;
    }
 
    // Count the number of distinct elements in a sorted array.
    public static int countDistinct(int[] arr) {
        int distinctCount = 1; // There's at least one element.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                distinctCount++;
            }
        }
        return distinctCount;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases.
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            
            // Sort both arrays.
            Arrays.sort(a);
            Arrays.sort(b);
            
            // Check if both arrays are "good".
            if (!isGood(a) || !isGood(b)) {
                System.out.println("NO");
                continue;
            }
            
            // Count distinct elements in each array.
            int distinctA = countDistinct(a);
            int distinctB = countDistinct(b);
            
            // Since we can rearrange array 'a' arbitrarily, the maximum number
            // of distinct sums we can get is at least the product of the distinct counts.
            if (distinctA * distinctB >= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
}