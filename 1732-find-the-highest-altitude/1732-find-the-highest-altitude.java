class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0;
        int largest = cur;
        
        for(var el : gain) {
            cur += el;
            largest = Integer.max(largest, cur);
        }
        
        return largest;
    }
}