import java.util.*;

class Solution {
    public int solution(int[] array) {
        final int LENGTH = array.length;
        
        Arrays.sort(array);
        return array[LENGTH / 2];
    }
}