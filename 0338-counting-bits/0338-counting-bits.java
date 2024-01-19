class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        
        for(int i=0; i<n+1; i++) {
            count[i] = Integer.bitCount(i);
        }
        
        return count;
    }
}