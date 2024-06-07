class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for (var num : nums) {
            counts[num]++;
        }

        for (int i = 0; i < nums.length; i++) {
            int point = nums[i];
            int cnt = 0;

            for (int j = 0; j < point; j++) {
                cnt += counts[j];
            }

            nums[i] = cnt;
        }

        return nums;
    }
}