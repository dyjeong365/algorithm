class Solution {
    public boolean isMonotonic(int[] nums) {
        final int LENGTH = nums.length;
        int positiveNum = 0;
        int negativeNum = 0;

        for (int i = 1; i < LENGTH; i++) {
            if (nums[i] - nums[i - 1] >= 0) {
                positiveNum++;
            } 
            
            if (nums[i] - nums[i - 1] <= 0) {
                negativeNum++;
            }
        }

        return positiveNum == LENGTH - 1 || negativeNum == LENGTH - 1;
    }
}