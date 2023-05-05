import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int index = 0;
        
        for(int i=0; i<num_list.length; i+=n){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}