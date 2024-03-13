class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        final int LENGTH = nums.length;

        for (int i = 0; i < LENGTH - 1; i++) {
            int point = nums[i];
            int j = i + 1;

            while (j <= LENGTH - 1 && Math.abs(i - j) <= k) {
                int target = nums[j++];

                if (point == target) {
                    return true;
                }
            }
        }

        return false;
    }
}