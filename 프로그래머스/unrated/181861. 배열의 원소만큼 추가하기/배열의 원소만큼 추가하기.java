import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int index = 0;
        
        for(var el : arr){
            for(int i=0; i<el; i++){
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[index++] = el;
            }
        }
        return answer;
    }
}