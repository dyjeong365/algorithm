import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {1};
        int index = 1;
        
        for(int i=2; i<=n; i++){
            if(n % i == 0){
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}