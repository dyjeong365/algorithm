class Solution {
    public int countQuadruplets(int[] nums) {
        final int LEN = nums.length;
        int res = 0;

        for (int a = 0; a < LEN; a++) {
            for (int b = a + 1; b < LEN; b++) {
                for (int c = b + 1; c < LEN; c++) {
                    for (int d = c + 1; d < LEN; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            res++;
                        }
                    }
                }
            }
        }

        return res;
    }
}