// package io.github.jiangdequan;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');                     // Outputs 195
        System.out.println("a" + "b");                    // Outputs "ab"
        System.out.println("a" + 'b');                    // Outputs "ab"
        System.out.println("a" + Integer.valueOf(56));    // Outputs "a56"
        System.out.println(new ArrayList<>().toString() + Integer.valueOf(56)); // Outputs "[]56"
    }
}
