import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            boolean flag = false;
            
            for(var el : String.valueOf(i).toCharArray()){
                if(el == '5' || el == '0'){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            
            if(flag) answer.add(i);
        }
        
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(Integer::intValue).toArray();
    }
}