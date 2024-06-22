class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int targetCount = 0;

        for (var num : nums) {
            if (num < target) {
                i++;
            }

            else if (num == target) {
                targetCount++;
            }
        }

        for (int j = 0; j < targetCount; j++) {
            ans.add(i++);
        }

        return ans;
    }
}