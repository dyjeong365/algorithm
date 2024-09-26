class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int i = 0;

        for (var num : nums) {
            if (!set.add(num)) {
                ans[i++] = num;
            }
        }

        return ans;
    }
}