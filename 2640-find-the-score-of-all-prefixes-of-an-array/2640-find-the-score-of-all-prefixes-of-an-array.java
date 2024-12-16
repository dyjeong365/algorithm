class Solution {
    public long[] findPrefixScore(int[] nums) {
        final int LEN = nums.length;
        long[] ans = new long[LEN];
        ans[0] = nums[0] * 2;
        int max = nums[0];

        for (int i = 1; i < LEN; i++) {
            max = Math.max(max, nums[i]);
            ans[i] = ans[i - 1] + nums[i] + max;
        }

        return ans;
    }
}