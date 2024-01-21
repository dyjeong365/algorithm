import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(var el : s.toCharArray()) {
            if(!stack.isEmpty() && el == '*') {
                stack.pop();
            } else {
                stack.push(el);
            }
        }
        
        for(var el : stack) {
            sb.append(el);
        }
        
        return sb.toString();
    }
}