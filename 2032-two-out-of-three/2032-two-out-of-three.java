class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        final int MAX = 101;
        List<Integer> ans = new ArrayList<>();
        boolean[] b1 = new boolean[MAX];
        boolean[] b2 = new boolean[MAX];
        boolean[] b3 = new boolean[MAX];

        for (var num1 : nums1) {
            b1[num1] = true;
        }

        for (var num2 : nums2) {
            b2[num2] = true;
        }

        for (var num3 : nums3) {
            b3[num3] = true;
        }

        for (int i = 1; i < MAX; i++) {
            if ((b1[i] && b2[i]) || (b1[i] && b3[i]) || (b2[i] && b3[i])) {
                ans.add(i);
            }
        }

        return ans;
    }
}