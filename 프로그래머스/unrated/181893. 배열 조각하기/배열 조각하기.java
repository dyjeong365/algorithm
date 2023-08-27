import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        for(int i=0; i<query.length; i++){
            arr = 
                i % 2 == 0 
                ? Arrays.copyOf(arr, query[i] + 1) 
                : Arrays.copyOfRange(arr, query[i], arr.length);
        }
        
        return arr;
    }
}