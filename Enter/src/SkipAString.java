package io.github.jiangdequan;

public class SkipAString {
    static String skip(String s) {
        if (s.isEmpty()) {
            return ""; // Fixed spelling of "return"
        }
        if (s.startsWith("apple")) {
            return skip(s.substring(5)); // Skip "apple" and call the function recursively
        } else {
            return s.charAt(0) + skip(s.substring(1)); // Keep the current character and move forward
        }
    }

    public static void main(String[] args) { // Fixed the incorrect method definition
        String result = skip("applebananaapplecherry");
        System.out.println(result); // Expected output: "bananacherry"
    }
}
