import java.util.*;

class Solution {
    public int[] solution(String s) {
        final int LENGTH = s.length();
        int[] answer = new int[LENGTH];
        Map<Character, Integer> map = new HashMap<>();
        
        Arrays.fill(answer, -1);
        
        for(int i=0; i<LENGTH; i++){
            Character each = s.charAt(i);
            
            if(map.containsKey(each)){
                answer[i] = i - map.get(each);
            }
            
            map.put(each, i);
        }
        
        return answer;
    }
}