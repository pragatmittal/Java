// package io.github.jiangdequan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkidibusAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(getMin(s)); // Call the method properly
        }
        sc.close();
    }

    static int getMin(String s) { // Change return type to int
        List<Character> l = new ArrayList<>();
        for (char i = 0; i < s.length(); i++) { // Keep your for loop format
            l.add(s.charAt(i)); // Add actual characters from the string
        }
        int count = 0;
        int i = 0;

        while (i < l.size() - 1) { // Avoid IndexOutOfBoundsException
            if (l.get(i).equals(l.get(i + 1))) {
                l.remove(i + 1); // Remove the duplicate character
                count++;
            } else {
                i++;
            }
        }
        return l.size(); // Return the size of the list
    }
}
