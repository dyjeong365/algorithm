import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>(); 
            boolean flag = true;
            
            for(var el : s.repeat(2).substring(i, i + s.length()).toCharArray()){
                if(el == '[' || el == '(' || el == '{'){
                    stack.push(el);
                }
                
                else{
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    
                    if((el == ']' && stack.peek() == '[') || (el == ')' && stack.peek() == '(') || (el == '}' && stack.peek() == '{')){
                        stack.pop();
                    } 
                }
            }
            
            if(stack.isEmpty() && flag) answer++;
        }
        
        return answer;
    }
}