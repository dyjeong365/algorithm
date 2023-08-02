import java.util.*;

class Solution
{
    public int solution(String s)
    {   
        Stack<Character> lowercase = new Stack<>();
        
        for(var each : s.toCharArray()){
            if(!lowercase.isEmpty() && lowercase.peek() == each){
                lowercase.pop();
            }
            
            else lowercase.push(each);
        }
        
        return lowercase.isEmpty() ? 1 : 0;
    }
}