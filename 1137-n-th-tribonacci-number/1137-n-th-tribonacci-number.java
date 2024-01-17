class Solution {
    public int tribonacci(int n) {
        final int MAX = 37;
        int[] T = new int[MAX + 1];
        T[2] = T[1] = 1;
        
        for(int i=3; i<MAX+1; i++) {
            T[i] = T[i-3] + T[i-2] + T[i-1];
        }
        
        return T[n];
    }
}