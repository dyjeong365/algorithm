import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {names[0]};
        int index = 1;
        
        for(int i=5; i<names.length; i+=5){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[index++] = names[i];
        }
        return answer;
    }
}