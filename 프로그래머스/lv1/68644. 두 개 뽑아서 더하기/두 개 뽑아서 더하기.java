import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        
        return numSet.stream()
            .mapToInt(i -> i)
            .sorted()
            .toArray();
    }
}