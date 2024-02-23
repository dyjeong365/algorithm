class Solution {
    public void rotate(int[] nums, int k) {
        int[] copyOfNums = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = copyOfNums[i];
        }
    }
}