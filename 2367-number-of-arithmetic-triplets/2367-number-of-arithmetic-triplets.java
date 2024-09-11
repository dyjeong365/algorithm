class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        final int LEN = nums.length;
        int ans = 0;

        for (int i = 0; i < LEN; i++) {
            for (int j = i + 1; j < LEN; j++) {
                for (int k = j + 1; k < LEN; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}