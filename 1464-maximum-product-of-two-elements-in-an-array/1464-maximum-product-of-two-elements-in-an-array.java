class Solution {
    public int maxProduct(int[] nums) {
        final int LEN = nums.length;
        int i = LEN - 1;
        int j = LEN - 2;

        Arrays.sort(nums);
        
        return (nums[i] - 1) * (nums[j] - 1);
    }
}