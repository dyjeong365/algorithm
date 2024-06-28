class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                ans += map.get(nums[i] - k);
            }

            if (map.containsKey(k + nums[i])) {
                ans += map.get(k + nums[i]);
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return ans;
    }
}