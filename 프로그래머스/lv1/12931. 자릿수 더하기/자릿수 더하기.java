public class Solution {
    public int solution(int N) {
        int answer = 0;
        String stringN = Integer.toString(N);
        
        for(int i = 0; i < stringN.length(); i++){
            answer += Character.getNumericValue(stringN.charAt(i));
        }
        return answer;
    }
}