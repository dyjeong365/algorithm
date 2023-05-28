import java.util.*;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .min()
            .getAsInt() 
            + " " 
            + Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .max()
            .getAsInt();
    }
}