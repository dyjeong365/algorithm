import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(var el : strArr){
            int length = el.length();
            
            if(map.containsKey(length)){
                map.put(length, map.get(length)+1);
            }
            else map.put(length, 1);
        }
   
        Collection<Integer> values = map.values();
        
        /* keySet
        Set<Integer> keySet = map.keySet();
        
        for(var key : keySet){
            answer = Math.max(answer, map.get(key));
        }
        */
        
        return map.values().stream()
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt();
    }
}