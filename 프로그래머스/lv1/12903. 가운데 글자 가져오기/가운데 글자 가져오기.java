class Solution {
    public String solution(String s) {
        final int LENGTH = s.length();
        String[] splitedS = s.split("");
        
        return LENGTH % 2 == 0 
            ? splitedS[LENGTH/2-1] + splitedS[LENGTH/2] 
            : splitedS[LENGTH/2];  
    }
}