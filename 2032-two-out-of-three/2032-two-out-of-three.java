class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = new int[101];

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (var num1 : nums1) {
            set1.add(num1);
        }

        for (var num2 : nums2) {
            set2.add(num2);
        }

        for (var num3 : nums3) {
            set3.add(num3);
        }

        for (var num1 : set1) {
            nums[num1]++;
        }

        for (var num2 : set2) {
            nums[num2]++;
        }

        for (var num3 : set3) {
            nums[num3]++;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 1) {
                ans.add(i);
            }
        }

        return ans;
    }
}