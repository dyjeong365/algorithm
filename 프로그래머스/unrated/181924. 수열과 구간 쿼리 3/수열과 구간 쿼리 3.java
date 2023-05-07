import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int temp = 0;
        
        for(int i=0; i<queries.length; i++){
            int BEFORE = queries[i][0];
            int AFTER = queries[i][1];
            
            temp = answer[BEFORE];
            answer[BEFORE] = answer[AFTER];
            answer[AFTER] = temp;
        }
        return answer;
    }
}