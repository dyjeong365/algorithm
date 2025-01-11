class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        final int LEN = nums.length;
        int[] ans = new int[LEN];
        int left = 0;
        int right = LEN - 1;

        for (int i = 0; i < LEN; i++) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }

            if (nums[LEN - 1 - i] > pivot) {
                ans[right--] = nums[LEN - 1 - i];
            }
        }

        System.out.println("left: " + left + " " + "right: " + right);

        while (left <= right) {
            ans[left++] = pivot;
        }

        return ans;
    }
}