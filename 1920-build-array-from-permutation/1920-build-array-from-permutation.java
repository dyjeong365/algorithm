class Solution {
    public int[] buildArray(int[] nums) {
        final int LEN = nums.length;
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}