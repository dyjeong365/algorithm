class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        final int MAX = Math.max(a, b);
        final int MIN = Math.min(a, b);
        
        for(int i=MIN; i<=MAX; i++){
            answer += i;
        }
        return answer;
    }
}