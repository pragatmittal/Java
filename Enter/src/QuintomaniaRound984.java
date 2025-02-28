import java.util.Scanner;

public class QuintomaniaRound984 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                solve(n);
            }
        }
    }
    
    static void solve(int n) {
        // Implementation of solution
        System.out.println(calculateResult(n));
    }
    
    static int calculateResult(int n) {
        // Add solution logic here
        return n;
    }
} 