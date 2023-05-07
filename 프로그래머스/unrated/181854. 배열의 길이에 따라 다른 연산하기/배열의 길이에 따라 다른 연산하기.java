import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        final int LENGTH = arr.length;
        int[] answer = Arrays.copyOf(arr, LENGTH);
        
        for(int i=0; i<LENGTH; i++){
            if(LENGTH % 2 == 0 && i % 2 != 0 || LENGTH % 2 != 0 && i % 2 == 0){
                answer[i] = arr[i] + n;
            }
        }
        return answer;
    }
}