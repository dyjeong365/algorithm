class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- > 0) {
            nums = operation(nums, multiplier);
        }

        return nums;
    }

    private static int[] operation(int[] nums, int multiplier) {
        int minIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[minIdx] > nums[i]) {
                minIdx = i;
            }
        }

        nums[minIdx] *= multiplier;

        return nums;
    }
}