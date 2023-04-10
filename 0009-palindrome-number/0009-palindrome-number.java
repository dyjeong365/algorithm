class Solution {
    public boolean isPalindrome(int x) {
        String answer = String.valueOf(x);
        for(int i=0; i<answer.length(); i++){
            if(answer.charAt(i) != answer.charAt(answer.length()-(i+1))) return false;
        }
        return true;
    }
}