class Solution {
    public int minOperations(int[] nums) {
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            while (nums[i - 1] >= nums[i]) {
                nums[i]++;
                res++;
            }
        }

        return res;
    }
}