class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] splitedS = s.toLowerCase().split("");
        
        answer.append(splitedS[0].equals(" ") ? splitedS[0] : splitedS[0].toUpperCase());
        
        for(int i=1; i<s.length(); i++){
            answer.append(splitedS[i-1].equals(" ") ? splitedS[i].toUpperCase() : splitedS[i]);
        }
        
        return answer.toString();
    }
}