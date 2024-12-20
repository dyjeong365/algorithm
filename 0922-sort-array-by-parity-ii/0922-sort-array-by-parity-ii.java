class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        final int LEN = nums.length;
        int even = 0;
        int odd = 1;

        while (true) {
            while (even < LEN && nums[even] % 2 == 0) {
                even += 2;
            }

            while (odd < LEN && nums[odd] % 2 == 1) {
                odd += 2;
            }

            if (even >= LEN && odd >= LEN) {
                return nums;
            }

            swap(nums, even, odd);
        }
    }

    private void swap(int[] nums, int even, int odd) {
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
    }
}