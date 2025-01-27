class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        final int LEN = nums.length;
        int[] ans = new int[LEN];
        Map<Integer, Integer> prefix = new HashMap<>();
        Map<Integer, Integer> suffix = new HashMap<>();

        for (var num : nums) {
            suffix.put(num, suffix.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < LEN; i++) {
            prefix.put(nums[i], prefix.getOrDefault(nums[i], 0) + 1);
            suffix.put(nums[i], suffix.get(nums[i]) - 1);

            if (suffix.get(nums[i]) == 0) {
                suffix.remove(nums[i]);
            }

            ans[i] = prefix.size() - suffix.size();
        }

        return ans;
    }
}