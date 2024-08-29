class Solution {
    public int[] leftRightDifference(int[] nums) {
        final int LEN = nums.length;
        int[] leftSum = new int[LEN];
        int[] rightSum = new int[LEN];
        int[] ans = new int[LEN];

        for (int i = 1; i < LEN; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
            rightSum[LEN - i - 1] = nums[LEN - i] + rightSum[LEN - i];
        }

        for (int i = 0; i < LEN; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}