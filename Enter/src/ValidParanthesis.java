package io.github.jiangdequan;

public class ValidParanthesis {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            
            for (char c : s.toCharArray()) {
                // Push opening brackets to the stack
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } 
                // If it's a closing bracket, check if it matches the top of the stack
                else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((top == '(' && c != ')') || 
                        (top == '{' && c != '}') || 
                        (top == '[' && c != ']')) {
                        return false;
                    }
                }
            }
            
            // If the stack is empty, all brackets matched properly
            return stack.isEmpty();
        }
    }
    
}