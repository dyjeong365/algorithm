class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        return recursive(nums, target, start, end);
    }

    private static int recursive(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (target > nums[mid]) {
            return recursive(nums, target, mid + 1, end);
        } else if (target < nums[mid]) {
            return recursive(nums, target, start, mid - 1);
        } else {
            return mid;
        }
    }
}