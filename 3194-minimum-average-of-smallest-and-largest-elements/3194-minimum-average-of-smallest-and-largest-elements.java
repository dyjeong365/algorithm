class Solution {
    public double minimumAverage(int[] nums) {
        final int n = nums.length;
        int start = 0;
        int end = n - 1;
        double ans = Double.MAX_VALUE;

        Arrays.sort(nums);

        while (start < end) {
            ans = Math.min(ans, (nums[start++] + nums[end--]) / 2.0);
        }

        return ans;
    }
}