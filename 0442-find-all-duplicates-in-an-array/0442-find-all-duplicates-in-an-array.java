class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (var num : nums) {
            if (!set.add(num)) {
                ans.add(num);
            }
        }

        return ans;
    }
}