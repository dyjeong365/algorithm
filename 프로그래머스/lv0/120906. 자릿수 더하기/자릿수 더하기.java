class Solution {
    public int solution(int n) {
        int answer = 0;
        String strVar = Integer.toString(n);
        
        for(int i=0; i<strVar.length(); i++){
            answer += Character.getNumericValue(strVar.charAt(i));
        }
        return answer;
    }
}