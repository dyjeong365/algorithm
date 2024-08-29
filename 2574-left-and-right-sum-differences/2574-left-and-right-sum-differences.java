class Solution {
    public int[] leftRightDifference(int[] nums) {
        final int LEN = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        int[] ans = new int[LEN];

        for (var num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < LEN; i++) {
            rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return ans;
    }
}