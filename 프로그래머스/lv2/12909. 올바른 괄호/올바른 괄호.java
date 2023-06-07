import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(s.length()-1) == '(') return false;
        
        for(int i=0; i<s.length(); i++){
            char each = s.charAt(i);
            
            if(each == ')'){
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
            else stack.push(each);
        }
        return stack.isEmpty();
    }
}