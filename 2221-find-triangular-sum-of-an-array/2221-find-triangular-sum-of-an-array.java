class Solution {
    public int triangularSum(int[] nums) {
        return arraySum(nums, nums.length);
    }

    private int arraySum(int[] nums, int len) {
        if (len == 1) {
            return nums[0];
        }

        for (int i = 0; i < len - 1; i++) {
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return arraySum(nums, len - 1);
    }
}