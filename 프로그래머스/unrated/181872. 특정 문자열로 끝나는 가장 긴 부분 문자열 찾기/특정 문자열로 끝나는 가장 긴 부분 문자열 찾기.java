class Solution {
    public String solution(String myString, String pat) {
        char last = pat.charAt(pat.length()-1);
        
        return myString.substring(0, myString.lastIndexOf(last) + 1);
    }
}