import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        final int FIRST_INTERVAL = intervals[0][1] - intervals[0][0] + 1;
        final int SECOND_INTERVAL = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = 
            new int[FIRST_INTERVAL + SECOND_INTERVAL];
        
        System.arraycopy(arr, intervals[0][0], answer, 0, FIRST_INTERVAL);
        System.arraycopy(arr, intervals[1][0], answer, FIRST_INTERVAL, SECOND_INTERVAL);
        return answer;
    }
}