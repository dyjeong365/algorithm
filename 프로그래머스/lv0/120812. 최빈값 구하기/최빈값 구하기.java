import java.util.*;

class Solution {
    public int solution(int[] array) {
        int mode = 0;
        int maxFrequency = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(var num : array){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for(var entry : frequencyMap.entrySet()){
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                mode = num;
            }
            
            else if(frequency == maxFrequency){
                mode = -1;
            }
        }
        
        return mode;
    }
}