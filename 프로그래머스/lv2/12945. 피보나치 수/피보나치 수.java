class Solution {
    public int solution(int n) {
        long[] fibonacci = new long[n+1];
        
        for(int i=0; i<=1; i++){
            fibonacci[i] = i;
        }
        
        for(int i=2; i<=n; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1234567;
        }
        
        return (int)fibonacci[n];
    }
}