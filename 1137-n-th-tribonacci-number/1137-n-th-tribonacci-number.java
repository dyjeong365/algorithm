class Solution {
    public int tribonacci(int n) {
        int[] T = new int[n + 3];
        T[2] = T[1] = 1;
        
        for(int i=3; i<n+1; i++) {
            T[i] = T[i-3] + T[i-2] + T[i-1];
        }
        
        return T[n];
    }
}