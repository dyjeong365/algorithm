class Solution {
    public String solution(String phone_number) {
        String answer = "";
        final int LENGTH = phone_number.length();
        
        for(int i=0; i<LENGTH; i++){
            if(LENGTH-i > 4) answer += "*";
            else answer = answer + phone_number.charAt(i);
        }
        return answer;
    }
}