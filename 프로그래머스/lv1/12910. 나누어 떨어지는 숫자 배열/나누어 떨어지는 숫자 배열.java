import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr)
            .filter(el -> el % divisor == 0)
            .count() == 0 
            ? new int[]{-1} 
        : Arrays.stream(arr)
            .filter(el -> el % divisor == 0)
            .sorted()
            .toArray();
    }
}