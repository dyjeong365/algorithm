class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);

        for (var num : nums) {
            if (num < k) {
                ans++;
            } else {
                break;
            }
        }

        return ans;
    }
}