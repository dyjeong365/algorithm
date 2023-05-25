import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] splitedString = myString.split("x");
        int[] answer = new int[splitedString.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = splitedString[i].length();
        }
        
        if(myString.charAt(myString.length()-1) == 'x'){
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length-1] = 0;
        }
        return answer;
    }
}