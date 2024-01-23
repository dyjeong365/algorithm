class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }
        
        double max = sum;
        
        for(int j=k; j<nums.length; j++) {
            // pollFirst and offerLast
            sum += nums[j] - nums[j - k];
            max = Math.max(max, sum);
        }
        
        return max / k;
    }
}