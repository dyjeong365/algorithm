class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        final int LEN = nums.length;
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            Set<Integer> prefix = new HashSet<>();
            Set<Integer> suffix = new HashSet<>();

            for (int j = 0; j <= i; j++) {
                prefix.add(nums[j]);
            }

            for (int k = i + 1; k < LEN; k++) {
                suffix.add(nums[k]);
            }

            ans[i] = prefix.size() - suffix.size();
        }

        return ans;
    }
}