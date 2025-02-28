import java.util.Scanner;
import java.util.Arrays;

public class MilyaAndTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            
            solve(n, a, b);
        }
        sc.close();
    }
    
    static void solve(int n, long[] a, long[] b) {
        long[] sortedA = a.clone();
        long[] sortedB = b.clone();
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        
        // Solution logic here
        System.out.println(calculateResult(n, a, b, sortedA, sortedB));
    }
    
    static long calculateResult(int n, long[] a, long[] b, long[] sortedA, long[] sortedB) {
        // Implementation of result calculation
        return 0; // Replace with actual calculation
    }
} 