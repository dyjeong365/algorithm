class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        // entire
        reverse(nums, 0, nums.length - 1);

        // k elements
        reverse(nums, 0, k - 1);

        // remaining
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}