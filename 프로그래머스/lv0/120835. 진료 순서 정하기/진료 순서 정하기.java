import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        final int LENGTH = emergency.length;
        int[] order = Arrays.copyOf(emergency, LENGTH);
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[LENGTH];
        
        Arrays.sort(order);
        
        for(int i=0; i<LENGTH; i++){
            map.put(order[i], LENGTH - i);
        }
        
        for(int i=0; i<LENGTH; i++){
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}