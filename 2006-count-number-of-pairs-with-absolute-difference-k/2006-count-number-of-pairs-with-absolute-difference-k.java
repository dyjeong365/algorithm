class Solution {
    public int countKDifference(int[] nums, int k) {
        final int LEN = nums.length;
        int ans = 0;

        for (int i = 0; i < LEN - 1; i++) {
            for (int j = i + 1; j < LEN; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}