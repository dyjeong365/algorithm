class Solution {
    public int[] numberGame(int[] nums) {
        final int LEN = nums.length;
        int[] ans = new int[LEN];

        Arrays.sort(nums);

        for (int i = 1; i < LEN; i += 2) {
            ans[i - 1] = nums[i];
            ans[i] = nums[i - 1];
        }

        return ans;
    }
}