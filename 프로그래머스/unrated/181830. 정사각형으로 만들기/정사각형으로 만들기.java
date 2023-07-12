import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        final int LENGTH = arr.length;
        final int INNER_LENGTH = arr[0].length;
        int[][] answer = {};
        
        if(LENGTH == INNER_LENGTH) return arr;
        
        if(LENGTH < INNER_LENGTH){
            answer = Arrays.copyOf(arr, INNER_LENGTH);
            
            for(int i=LENGTH; i<answer.length; i++){
                answer[i] = new int[answer.length];
            }
        } 
            
        else if(LENGTH > INNER_LENGTH){
            answer = Arrays.copyOf(arr, LENGTH);
            
            for(int i=0; i<answer.length; i++){
                answer[i] = Arrays.copyOf(answer[i], LENGTH);
            }
        }
        return answer;
    }
}