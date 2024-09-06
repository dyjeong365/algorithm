class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        final int LEN = nums.length;
        List<Integer> list = new LinkedList<>();
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < LEN; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}