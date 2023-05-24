import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int index = 0;
        String[] splitedStr = my_string.trim().split(" ");
        
        for(int i=0; i<splitedStr.length; i++){
            if(splitedStr[i].equals("")) continue;
            else{
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[index++] = splitedStr[i];
            }
        }
        return answer;
    }
}