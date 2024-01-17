import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(var el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        
        for(var value : map.values()) {
            if(set.contains(value)) {
                return false;
            }
            
            set.add(value);
        }
        
        return true;
    }
}