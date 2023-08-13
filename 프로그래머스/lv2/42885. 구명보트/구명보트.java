import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        final int LENGTH = people.length;
        int i = 0, j = LENGTH;
        
        Arrays.sort(people);
        
        while(i < --j){
            if(people[i] + people[j] <= limit){
                i++;
            }
        }
        
        return LENGTH - i;
    }
}