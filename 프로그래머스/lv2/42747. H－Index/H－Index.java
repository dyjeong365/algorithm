import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        final int LENGTH = citations.length;
        
        Arrays.sort(citations);
        
        for(int i=0; i<LENGTH; i++){
            int count = LENGTH - i;
            
            if (citations[i] >= count){
                answer = count;
                break;
            }
        }
        
        return answer;
    }
}