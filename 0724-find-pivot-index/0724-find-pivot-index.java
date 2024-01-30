class Solution {
    public int pivotIndex(int[] nums) {
        final int LENGTH = nums.length;
        int answer = -1;
        int prev = nums[0];
        
        for(int i=1; i<LENGTH; i++) {
            nums[i] += prev;
            prev = nums[i];
        }
        
        int sum = 0;
        
        for(int i=0; i<LENGTH; i++) {
            if(sum == nums[LENGTH - 1] - nums[i]) {
                return i;
            }
            
            sum = nums[i];
        }
        
        return answer;
    }
}