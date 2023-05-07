import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        final int LENGTH = num_list.length;
        int[] answer = new int[LENGTH];
        answer = Arrays.copyOf(num_list, LENGTH+1);
        
        answer[LENGTH] = num_list[LENGTH-2] < num_list[LENGTH-1] 
            ? num_list[LENGTH-1] - num_list[LENGTH-2]
            : num_list[LENGTH-1] * 2;
        return answer;
    }
}