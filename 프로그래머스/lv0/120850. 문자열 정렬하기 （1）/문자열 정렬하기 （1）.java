import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        final int LENGTH = my_string.length();
        int[] answer = new int[LENGTH];
        
        for(int i=0; i<LENGTH; i++){
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}