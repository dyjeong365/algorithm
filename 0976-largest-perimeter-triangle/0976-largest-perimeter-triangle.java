class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--) {
            int largest = nums[i];
            int sumWithoutLargest = nums[i - 1] + nums[i - 2];

            if (largest < sumWithoutLargest) {
                return largest + sumWithoutLargest;
            }
        }

        return 0;
    }
}