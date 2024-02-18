class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int prev = 101;

        for(var num : nums) {
            if(num != prev) {
                nums[i] = num;
                prev = nums[i++];
            }
        }

        return i;
    }
}