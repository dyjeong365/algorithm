class Solution {
    public int triangularSum(int[] nums) {
        return arraySum(nums);
    }

    private int arraySum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return arraySum(Arrays.copyOf(nums, nums.length - 1));
    }
}