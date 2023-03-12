public class Solution {
    public int solution(int N) {
        int answer = 0;
        
        while(N != 0){
            answer += N % 10;
            N /= 10;
        }
        return answer;
    }
}