class Solution {
    public int[] shuffle(int[] nums, int n) {
        final int LEN = nums.length;
        int x = 0;
        int y = n;
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            ans[i] = (i % 2 == 0) ? nums[x++] : nums[y++];
        }

        return ans;
    }
}