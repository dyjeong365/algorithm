class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] num_char = num_str.toCharArray();
        
        for(var number : num_char){
            answer += Character.getNumericValue(number);
        }
        return answer;
    }
}