import java.util.*;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        return Arrays.stream(s.split(""))
            .filter(el -> el.equals("p"))
            .count() 
            == 
            Arrays.stream(s.split(""))
            .filter(el -> el.equals("y"))
            .count() 
            ? true : false;
    }
}