import java.util.Scanner;
import java.util.Arrays;

public class CodeforcesRound1002A {
    public static boolean isGood(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count < 2) return false;
                count = 1;
            }
        }
        return count >= 2;
    }

    public static int countDistinct(int[] arr) {
        int distinctCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) distinctCount++;
        }
        return distinctCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            if (!isGood(a) || !isGood(b)) {
                System.out.println("NO");
                continue;
            }
            
            System.out.println(countDistinct(a) * countDistinct(b) >= 3 ? "YES" : "NO");
        }
        sc.close();
    }
} 