class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        final int LEN = nums.length;
        int start = 0;
        int end = LEN - 1;

        while (start < end) {
            StringBuilder sb = new StringBuilder();

            sb.append(nums[start++])
                    .append(nums[end--]);

            res += Long.parseLong(sb.toString());
        }

        if (LEN % 2 == 1) {
            res += nums[LEN / 2];
        }

        return res;
    }
}