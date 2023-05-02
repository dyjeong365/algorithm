class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(var number : numbers){
            if(answer > n) break;
            answer += number;
        }
        return answer;
    }
}