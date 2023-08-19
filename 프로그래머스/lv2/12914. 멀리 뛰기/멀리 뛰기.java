import java.util.*;

class Solution {
    public long solution(int n) {
        return fibonacci(n);
    }
    
    public long fibonacci(int n){
        if(n <= 3) return n;
        
        long result = 0;
        Map<Integer, Long> map = new HashMap<>();
        
        for(int i=1; i<=n; i++){
            if(i <= 3){
                map.put(i, (long)i);
            }
            
            else {
                // result = ((map.get(i-2) % 1234567) + (map.get(i-1) % 1234567));
                result = (map.get(i-2) + map.get(i-1)) % 1234567;
                map.put(i, result);
            }
        }
        
        return result;
    }
}