class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for (var num : nums) {
            counts[num]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = (nums[j] == 0) ? 0 : counts[nums[j] - 1];
        }

        return nums;
    }
}