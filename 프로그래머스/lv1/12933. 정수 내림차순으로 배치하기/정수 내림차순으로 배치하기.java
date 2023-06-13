import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] splitedN = String.valueOf(n).split("");
        
        Arrays.sort(splitedN);
        
        for(var el : splitedN){
            answer += el;
        }
        
        return Long.parseLong(new StringBuilder(answer).reverse().toString());
    }
}