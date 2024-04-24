class Solution {
    public int missingNumber(int[] nums) {
        int[] counts = new int[nums.length + 1];

        for (var num : nums) {
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}