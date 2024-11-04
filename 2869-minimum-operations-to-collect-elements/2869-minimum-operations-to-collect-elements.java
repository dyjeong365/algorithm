class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int res = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            res++;

            if (nums.get(i) <= k) {
                set.add(nums.get(i));
            }

            if (set.size() == k) {
                return res;
            }
        }

        return -1;
    }
}