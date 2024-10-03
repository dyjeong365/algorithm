class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        final double LEN = nums1.length;
        int sum1 = 0;
        int sum2 = 0;

        for (var num2 : nums2) {
            sum2 += num2;
        }

        for (var num1 : nums1) {
            sum1 += num1;
        }

        return (int) ((sum2 - sum1) / LEN);
    }
}