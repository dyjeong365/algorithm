import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 0;
        final int LONGEST_SIDE_IN_SIDES_ARR = sides[1];
        final int OTHER_SIDE = sides[0];
        final int SUM = LONGEST_SIDE_IN_SIDES_ARR + OTHER_SIDE;
        final int DIFF = LONGEST_SIDE_IN_SIDES_ARR - OTHER_SIDE;

        for(int i=DIFF+1; i<LONGEST_SIDE_IN_SIDES_ARR; i++) answer++;

        for(int j=LONGEST_SIDE_IN_SIDES_ARR+1; j<= SUM; j++) answer++;
        
        return answer;
    }
}