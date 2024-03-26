class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int end = 1;

        while (end < nums.length) {
            if (nums[start] == 0 && nums[end] != 0) {
                nums[start] = nums[end];
                nums[end] = 0;
                start++;
                end++;
            } else if (nums[start] == 0 && nums[end] == 0) {
                end++;
            } else {
                start++;
                end++;
            }
        }
    }
}