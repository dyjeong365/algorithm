import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        final int LENGTH = my_str.length();
        String[] answer = {};
        int index = 0;
        
        for(int i=0; i<LENGTH; i+=n){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[index++] = i+n < LENGTH ? my_str.substring(i, i+n) : my_str.substring(i);
        }
        return answer;
    }
}