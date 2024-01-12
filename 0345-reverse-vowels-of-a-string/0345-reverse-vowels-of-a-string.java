import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        final int LENGTH = s.length();
        StringBuilder sb = new StringBuilder(s);
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i=0; i<LENGTH; i++){
            char alphabet = s.charAt(i);
            
            if(isVowel(alphabet)){
                deque.offer(i);
            }
        }
        
        while(deque.size() > 1){
            int start = deque.pollFirst();
            char valueOfStart = s.charAt(start);
            int end = deque.pollLast();
            char valueOfEnd =s.charAt(end);
            
            sb.setCharAt(start, valueOfEnd);
            sb.setCharAt(end, valueOfStart);
        }
        
        return sb.toString();
    }
    
    private boolean isVowel(char alphabet){
        if(alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' || alphabet == 'i' || alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U'){
            return true;
        }
        
        return false;
    }
}