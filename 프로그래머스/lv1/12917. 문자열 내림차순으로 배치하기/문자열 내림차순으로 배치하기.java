import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitedS = s.split("");
        
        Arrays.sort(splitedS);
        
        for(var el : splitedS){
            sb.append(el);
        }
        return sb.reverse().toString();
    }
}