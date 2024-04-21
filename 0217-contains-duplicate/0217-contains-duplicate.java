class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (var num : nums) {
            if (map.containsKey(num)) {
                return true;
            }

            map.put(num, true);
        }

        return false;
    }
}