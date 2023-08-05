import java.math.*;
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Map<String, Boolean> map = new HashMap<>();
        
        map.put(words[0], true);
        
        for(int i=1; i<words.length; i++){
            if((words[i-1].charAt(words[i-1].length()-1)) != (words[i].charAt(0)) || map.containsKey(words[i])){
                return new int[]{(i % n) + 1, (int)Math.ceil(i/n) + 1};
            }
            
            map.put(words[i], true);
        }
        
        return new int[2];
    }
}