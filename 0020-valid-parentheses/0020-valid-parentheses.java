class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(var el : s.toCharArray()) {
            if(el == '(') {
                stack.push(')');
            }
            
            else if(el == '{') {
                stack.push('}');
            }
            
            else if(el == '[') {
                stack.push(']');
            }
            
            else if(stack.isEmpty() || stack.pop() != el) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}