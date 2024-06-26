class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

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
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        for (var num2 : set2) {
            map.put(num2, map.getOrDefault(num2, 0) + 1);
        }

        for (var num3 : set3) {
            map.put(num3, map.getOrDefault(num3, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}