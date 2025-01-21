class Solution {
    public int triangularSum(int[] nums) {
        return sum(nums);
    }

    private int sum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] res = new int[nums.length - 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return sum(res);
    }
}