class Solution {
    public int minimumOperations(int[] nums) {
        int ans = nums.length;

        for (var num : nums) {
            if (num % 3 == 0) {
                ans -= 1;
            }
        }

        return ans;
    }
}