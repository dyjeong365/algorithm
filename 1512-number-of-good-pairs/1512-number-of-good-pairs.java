class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] counts = new int[101];

        for (var num : nums) {
            res += counts[num]++;
        }

        return res;
    }
}