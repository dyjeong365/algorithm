import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] count = new int[Arrays.stream(tangerine).max().getAsInt() + 1];
        final int LENGTH = count.length;
        
        for(var el : tangerine){
            count[el]++;
        }
        
        Arrays.sort(count);
        
        if(count[LENGTH-1] >= k) return 1;
        
        for(int i=LENGTH - 1; i>=0; i--){
            k -= count[i];
            answer++;
            
            if(k <= 0) break;
        }

        return answer;
    }
}