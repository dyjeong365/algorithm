import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int LENGTH = answer.length;
        int i = 0;
        
        while(Math.pow(2, i) < LENGTH){
            i++;
        }
        
        int count = (int)Math.pow(2, i) - LENGTH;
            
        for(int j=0; j<count; j++){
            answer = Arrays.copyOf(answer, LENGTH+1);
            LENGTH = answer.length;
            answer[LENGTH-1] = 0;
        }
        
        return answer;
    }
}