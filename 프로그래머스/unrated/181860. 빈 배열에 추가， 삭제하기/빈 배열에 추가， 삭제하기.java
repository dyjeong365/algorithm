import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    stack.push(arr[i]);
                }
            }
            else{
                for(int k=0; k<arr[i]; k++){
                    stack.pop();
                }
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(var el : stack){
            answer[index++] = el;
        }
        return answer;
    }
}