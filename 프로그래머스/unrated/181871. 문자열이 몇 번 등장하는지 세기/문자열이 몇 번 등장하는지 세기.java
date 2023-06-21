class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        final int LENGTH = myString.length();
        
        for(int i=0; i<LENGTH; i++){
            int end = i + pat.length() > LENGTH ? LENGTH : i + pat.length();
            
            if(myString.substring(i, end).contains(pat)) answer++;
        }
        return answer;
    }
}