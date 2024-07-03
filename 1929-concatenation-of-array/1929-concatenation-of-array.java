class Solution {
    public int[] getConcatenation(int[] nums) {
        final int NUMS_LEN = nums.length;
        int[] ans = new int[NUMS_LEN * 2];

        for (int i = 0; i < NUMS_LEN; i++) {
            ans[i] = ans[i + NUMS_LEN] = nums[i];
        }

        return ans;
    }
}