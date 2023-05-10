class Solution {
    public boolean solution(String s) {
        final int LENGTH = s.length();
        
        for(int i=0; i<LENGTH; i++){
            if((LENGTH != 4 && LENGTH != 6) || s.charAt(i) >= 65) {
                return false;
            }
        }
        return true;
    }
}