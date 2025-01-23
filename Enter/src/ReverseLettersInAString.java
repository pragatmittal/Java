package io.github.jiangdequan;

public class ReverseLettersInAString {
    char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            if (!Character.isLetter(arr[start])) {
                start++;  // Move start pointer forward if it's not a letter
            } else if (!Character.isLetter(arr[end])) {
                end--;  // Move end pointer backward if it's not a letter
            } else {
                // Swap the letters at start and end
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                // Move both pointers towards each other
                start++;
                end--;
            }
        }
        
        return new String(arr);  // Return the modified string
    }
}