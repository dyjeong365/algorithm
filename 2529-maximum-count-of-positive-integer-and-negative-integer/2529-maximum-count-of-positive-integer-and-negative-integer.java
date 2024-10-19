class Solution {
    public int maximumCount(int[] nums) {
        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return nums.length;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                start = mid + 1;
            }

            else {
                end = mid;
            }
        }

        int neg = start;

        while (start < nums.length && nums[start] == 0) {
            start++;
        }

        int pos = nums.length - start;

        return Math.max(neg, pos);
    }
}