class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(var el : s.toCharArray()) {
            if(el == '(' || el == '{' || el == '[') {
                stack.push(el);    
            } else {
                if(!stack.isEmpty() && isPair(stack.peek(), el)) {
                    stack.pop();
                } else return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    private boolean isPair(Character prev, Character el) {
        return (prev == '(' && el == ')') || (prev == '{' && el == '}') || (prev == '[' && el == ']');
    }
}