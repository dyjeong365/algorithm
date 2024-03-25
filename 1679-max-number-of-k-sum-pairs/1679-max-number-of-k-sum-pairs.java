class Solution {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);

        while (start < end) {
            if (nums[start] + nums[end] == k) {
                start++;
                end--;
                operations++;
            }

            else if (nums[start] + nums[end] > k) {
                end--;
            }

            else {
                start++;
            }
        }

        return operations;
    }
}