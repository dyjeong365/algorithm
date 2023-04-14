class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = String.valueOf(age);
        
        for(int i=0; i<temp.length(); i++){
            int converting = temp.charAt(i) - '0';
            answer = answer + (char)(converting + 97);    
        }
        return answer;
    }
}