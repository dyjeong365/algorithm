import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            final int LENGTH = commands[i][1] - commands[i][0] + 1;
            int[] result = new int[LENGTH];
            
            System.arraycopy(array, commands[i][0] - 1, result, 0, LENGTH);
            Arrays.sort(result);
            answer[i] = result[commands[i][2] - 1];
        }
        
        return answer;
    }
}