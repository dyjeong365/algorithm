class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (var num1 : nums1) {
            set1.add(num1);
        }

        for (var num2 : nums2) {
            set2.add(num2);
        }

        for (var num1 : nums1) {
            if (set2.contains(num1)) {
                ans[0]++;
            }
        }

        for (var num2 : nums2) {
            if (set1.contains(num2)) {
                ans[1]++;
            }
        }

        return ans;
    }
}