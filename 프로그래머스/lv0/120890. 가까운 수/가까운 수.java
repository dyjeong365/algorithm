import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = 100;
        
        if(array.length == 1) return array[0];
        
        Arrays.sort(array);
        
        for(var el : array){
            int diff = Math.abs(n-el);
            
            if(max > diff){
                answer = el;
                max = diff;
            }
        }
        return answer;
    }
}