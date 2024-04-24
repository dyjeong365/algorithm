class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}