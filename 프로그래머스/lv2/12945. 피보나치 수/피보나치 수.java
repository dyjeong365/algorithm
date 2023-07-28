import java.util.*;

class Solution {
    public int solution(int n) {
        return fibonacci(n);
    }
    
    private int fibonacci(int number){
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<=1; i++){
            result.add(i);
        }
        
        for(int i=2; i<=number; i++){
            result.add((result.get(i-1) + result.get(i-2)) % 1234567);
        }
        
        return result.get(number);
    }
}