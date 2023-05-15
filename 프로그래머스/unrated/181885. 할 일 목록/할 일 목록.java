import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int index = 0;
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}