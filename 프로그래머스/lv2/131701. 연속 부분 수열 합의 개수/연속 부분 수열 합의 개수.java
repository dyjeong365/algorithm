import java.util.*;

class Solution {
    public int solution(int[] elements) {
        final int LENGTH_OF_ELEMENTS = elements.length;
        Set<Integer> possibleSums = new HashSet<>();

        for (int start = 0; start < LENGTH_OF_ELEMENTS; start++) {
            int sum = 0;
            
            for (int len = 1; len <= LENGTH_OF_ELEMENTS; len++) {
                sum += elements[(start + len - 1) % LENGTH_OF_ELEMENTS];
                possibleSums.add(sum);
            }
        }

        return possibleSums.size();
    }
}
