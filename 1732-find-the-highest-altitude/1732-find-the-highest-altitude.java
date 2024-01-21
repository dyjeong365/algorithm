class Solution {
    public int largestAltitude(int[] gain) {
        int prev;
        
        for(int i=1; i<gain.length; i++) {
            prev = gain[i - 1];
            gain[i] += prev;
        }
        
        int max = 0;
        
        for(var el : gain) {
            max = Integer.max(max, el);
        }
        
        return max;
    }
}