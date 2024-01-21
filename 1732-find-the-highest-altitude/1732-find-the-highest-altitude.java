class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        int prev;
        
        for(int i=1; i<altitude.length; i++) {
            prev = altitude[i-1];
            altitude[i] += (gain[i - 1] + prev);
        }
        
        int max = Integer.MIN_VALUE;
        
        for(var el : altitude) {
            max = Integer.max(max, el);
        }
        
        return max;
    }
}