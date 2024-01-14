import java.util.*;

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitedS = s.trim().split(" ");
        
        for(int i=splitedS.length-1; i>=0; i--){
            if(!splitedS[i].isEmpty()){
                sb.append(splitedS[i]).append(i != 0 ? " " : "");
            }
        }
        
        return sb.toString();
    }
}