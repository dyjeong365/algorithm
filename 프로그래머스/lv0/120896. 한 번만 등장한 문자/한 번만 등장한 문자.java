import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Boolean> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            Character each = s.charAt(i);
            
            if(!map.containsKey(each)) map.put(each, true);
            else map.put(each, false);
        }
        
        for(int i=0; i<s.length(); i++){
            Character each = s.charAt(i);

            if(map.containsKey(each) && map.get(each)){
                sb.append(each);
            }
        }
        return Arrays.stream(sb.toString().split(""))
            .sorted()
            .collect(Collectors.joining());
    }
}