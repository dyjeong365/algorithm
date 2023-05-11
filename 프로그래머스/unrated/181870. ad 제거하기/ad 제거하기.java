import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int index = 0;
        
        for(var el : strArr){
            if(el.contains("ad")) continue;
            else {
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[index++] = el;
            }
        }
        return answer;
    }
}