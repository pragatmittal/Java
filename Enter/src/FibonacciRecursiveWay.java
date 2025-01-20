package io.github.jiangdequan;

public class FibonacciRecursiveWay {
    public static void main(String[] args) {
        System.out.println(fibo(6)); // Example usage
    }
    
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // Correct recursive call
    }
}
