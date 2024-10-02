class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (var num : nums) {
            max = Math.max(max, num);
        }

        while (k-- > 0) {
            sum += max;
            max++;
        }

        return sum;
    }
}