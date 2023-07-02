import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        String[] splitedStr = myStr.split("a|b|c"); 
        
        if (splitedStr.length == 0) return new String[]{"EMPTY"};
        
        return Arrays.stream(splitedStr)
            .filter(i -> !i.isEmpty())
            .toArray(String[]::new);
    }
}