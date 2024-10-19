class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (var num : nums) {
            if (num < 0) {
                neg++;
            }

            else if (num > 0) {
                pos = nums.length - (neg + zero);
            }

            else {
                zero++;
            }
        }

        return Math.max(pos, neg);
    }
}