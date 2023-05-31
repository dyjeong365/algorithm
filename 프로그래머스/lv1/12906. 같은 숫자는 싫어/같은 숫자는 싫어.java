import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(var el : arr){
            if(stack.isEmpty() || el != stack.peek()){
                stack.push(el);
            }
        }
        
        return stack.stream()
            .mapToInt(el -> el)
            .toArray();
    }
}