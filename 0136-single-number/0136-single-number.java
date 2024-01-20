import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(var entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();

            }
        }
        
        return 0;
    }
}