class Solution {
    public int maxProductDifference(int[] nums) {
        final int LEN = nums.length;

        Arrays.sort(nums);

        return (nums[LEN - 1] * nums[LEN - 2]) - (nums[0] * nums[1]);
    }
}