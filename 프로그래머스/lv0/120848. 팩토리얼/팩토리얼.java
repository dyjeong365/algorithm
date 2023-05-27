class Solution {
    public int solution(int n) {
        long answer = 2L;
        int base = 2;
        
        if (n < 3) return n;
        
        while(answer <= n){
            answer *= ++base; 
        }
        return base-1;
    }
}