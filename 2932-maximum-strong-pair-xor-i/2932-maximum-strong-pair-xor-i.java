class Solution {
    public int maximumStrongPairXor(int[] nums) {
        final int LEN = nums.length;
        int max = 0;

        for (var x : nums) {
            for (var y : nums) {
                if (Math.abs(x - y) <= Math.min(x, y)) {
                    max = Math.max(max, x ^ y);
                }
            }
        }

        return max;
    }
}