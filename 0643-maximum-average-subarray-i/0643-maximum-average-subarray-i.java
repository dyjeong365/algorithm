class Solution {
    public double findMaxAverage(int[] nums, int k) {
        final int LENGTH = nums.length;
        int prev;
        
        for(int i=1; i<LENGTH; i++) {
            prev = nums[i - 1];
            nums[i] += prev;
        }
        
        double max = nums[k - 1];
        
        for(int j=k; j<LENGTH; j++) {
            max = Math.max(max, nums[j] - nums[j - k]);
        }
        
        return max / k;
    }
}