import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int totalRuntime = 0;
        Queue<String> cache = new LinkedList<>();
        
        for (var city : Arrays.stream(cities).map(el -> el.toLowerCase()).toArray(String[]::new)){
            // totalRuntime += cache.contains(city) ? 1 : 5;
            if(cache.contains(city)){
                totalRuntime += 1;
                cache.remove(city);
            }
            
            else totalRuntime += 5;
                        
            if(!cache.isEmpty() && cache.size() == cacheSize){
                cache.poll();
            }
            
            if(cache.size() < cacheSize){
                cache.offer(city);
            }
        }
        
        return totalRuntime;
    }
}