import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
            .map(el -> el >= 50 && el % 2 == 0 ? el / 2 
                 : el < 50 && el % 2 != 0 ? el * 2 : el)
            .toArray();
    }
}