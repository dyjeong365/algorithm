class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int freeCoke = (n / a) * b;
            
            n = freeCoke + (n % a);
            answer += freeCoke;
        }
        
        return answer;
    }
}