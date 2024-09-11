class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            seen.add(nums[i]);
        }

        for (var num : nums) {
            if (seen.contains(num + diff) && seen.contains(num + 2 * diff)) {
                ans++;
            }
        }

        return ans;
    }
}