class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (var num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }

        return i;
    }
}