class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (var num1 : nums1) {
            set1.add(num1);
        }

        for (var num2 : nums2) {
            set2.add(num2);
        }

        set1.retainAll(set2);

        int[] ans = new int[set1.size()];
        int i = 0;

        for (var pos : set1) {
            ans[i++] = pos;
        }

        return ans;
    }
}