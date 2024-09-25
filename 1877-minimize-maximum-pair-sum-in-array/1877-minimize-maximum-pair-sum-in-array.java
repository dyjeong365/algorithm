class Solution {
    public int minPairSum(int[] nums) {
        final int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);

        for (int i = 0; i < n / 2; i++) {
            ans = Math.max(ans, nums[i] + nums[n - i - 1]);
        }

        return ans;
    }
}