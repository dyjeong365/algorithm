class Solution {
    public int maximumStrongPairXor(int[] nums) {
        final int LEN = nums.length;
        int max = 0;

        for (int i = 0; i < LEN; i++) {
            int x = nums[i];

            for (int j = 0; j < LEN; j++) {
                int y = nums[j];

                if (Math.abs(x - y) <= Math.min(x, y)) {
                    max = Math.max(max, x ^ y);
                }
            }
        }

        return max;
    }
}