class Solution {
    public int minOperations(int[] nums) {
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int cur = nums[i];

            if (prev >= cur) {
                int replacement = prev + 1;

                res += replacement - cur;
                nums[i] = replacement;
            }
        }

        return res;
    }
}