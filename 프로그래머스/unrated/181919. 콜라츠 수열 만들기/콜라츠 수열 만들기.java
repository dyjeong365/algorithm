import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {n};
        
        while(answer[answer.length-1] != 1){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length-1] 
                = answer[answer.length-2] % 2 == 0 ? answer[answer.length-2]/2 : (3*answer[answer.length-2])+1; 
        }
        return answer;
    }
}