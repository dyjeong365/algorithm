class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- > 0) {
            nums = operation(nums, multiplier);
        }

        return nums;
    }

    private static int[] operation(int[] nums, int multiplier) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIdx = i;
            }
        }

        nums[minIdx] *= multiplier;

        return nums;
    }
}