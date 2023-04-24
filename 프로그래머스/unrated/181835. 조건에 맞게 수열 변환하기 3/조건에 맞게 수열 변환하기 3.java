import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return k % 2 == 0 
            ? IntStream.range(0, arr.length).map(i -> arr[i] + k).toArray() 
            : IntStream.range(0, arr.length).map(i -> arr[i] * k).toArray(); 
    }
}