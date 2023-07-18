import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = Arrays.stream(arr).distinct().toArray();
        int originalLength = answer.length;
        
        answer = Arrays.copyOf(answer, k);
        
        if(originalLength < k){
            for(int i=originalLength; i<k; i++){
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}