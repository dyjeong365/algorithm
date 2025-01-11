class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;

        for (var num : nums) {
            if (num < pivot) {
                ans[i++] = num;
            }
        }

        for (var num : nums) {
            if (num == pivot) {
                ans[i++] = num;
            }
        }

        for (var num : nums) {
            if (num > pivot) {
                ans[i++] = num;
            }
        }

        return ans;
    }
}