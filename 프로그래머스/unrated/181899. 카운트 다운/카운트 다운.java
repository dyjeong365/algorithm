import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        
        for(int i=0; start>=end; i++){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[i] = start;
            start--;
        }
        return answer;
    }
}