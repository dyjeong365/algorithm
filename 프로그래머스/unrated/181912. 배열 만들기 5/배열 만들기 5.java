import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int index = 0;
        
        for(int i=0; i<intStrs.length; i++){
            int subStrs = Integer.parseInt(intStrs[i].substring(s, s+l));
            
            if(subStrs>k){
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[index++] = subStrs;
            }
        }
        return answer;
    }
}