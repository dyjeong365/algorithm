import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String loser = "";
        
        for(var player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for(var winner : completion){
            if(map.containsKey(winner)){
                map.put(winner, map.get(winner) - 1);
            }
        }
        
        for(var entry : map.entrySet()){
            if(entry.getValue() == 1){
                loser = entry.getKey();
                break;
            }
        }
        
        return loser;
    }
}