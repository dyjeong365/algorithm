class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                // Keep only elements in range k
                set.remove(nums[i - k - 1]);

            // Returns true if the value of nums[i] exists
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}