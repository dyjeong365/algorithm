class Solution {
    public int solution(int n) {
        int answer = 1 + n;
        
        if (n == 0 || n == 1) answer = n;
        
        for (int i = 2; i <= (n/2); i++){
            if(n % i == 0) answer += i;
        }
        
        return answer;
    }
}