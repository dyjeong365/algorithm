import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> count = new HashMap<>();
        
        for(String[] cloth : clothes){
            String typeOfCloth = cloth[1];
            
            count.put(typeOfCloth, count.getOrDefault(typeOfCloth, 0) + 1);
        }
        
        for(var value : count.values()){
            answer *= (value + 1);
        }
        
        return answer - 1;
    }
}