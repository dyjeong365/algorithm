class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;

        for (var num : nums) {
            if (num < k) {
                ans++;
            }
        }

        return ans;
    }
}