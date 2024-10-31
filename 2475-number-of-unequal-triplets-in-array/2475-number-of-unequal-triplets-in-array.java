class Solution {
    public int unequalTriplets(int[] nums) {
        final int LEN = nums.length;
        int res = 0;

        for (int i = 0; i < LEN; i++) {
            for (int j = i + 1; j < LEN; j++) {
                for (int k = j + 1; k < LEN; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        res++;
                    }
                }
            }
        }

        return res;
    }
}