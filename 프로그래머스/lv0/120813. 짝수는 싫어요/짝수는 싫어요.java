import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int index = 0;
        
        for (int i=1; i<=n; i+=2){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[index] = i;
            index++;
        }
        return answer;
    }
}