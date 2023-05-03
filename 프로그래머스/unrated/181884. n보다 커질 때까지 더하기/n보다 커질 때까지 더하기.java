import java.util.*;

class Solution {
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a > n ? a : a + b);
    }
}