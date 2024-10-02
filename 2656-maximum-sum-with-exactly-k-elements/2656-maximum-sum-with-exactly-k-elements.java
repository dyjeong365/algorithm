class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;

        Arrays.sort(nums);

        sum += nums[nums.length - 1] * k;

        for (int i = 1; i < k; i++) {
            sum += i;
        }

        return sum;
    }
}