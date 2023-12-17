class Solution {
    public int solution(int n) {
        final int MAX = 60_000;
        int[] fibonacci = new int[MAX + 1];
        fibonacci[1] = 1;
        fibonacci[2] = 2;
        
        for(int i=3; i<=MAX; i++){
            fibonacci[i] = (fibonacci[i-2] + fibonacci[i-1]) % 1_000_000_007;
        }
        
        return fibonacci[n];
    }
}