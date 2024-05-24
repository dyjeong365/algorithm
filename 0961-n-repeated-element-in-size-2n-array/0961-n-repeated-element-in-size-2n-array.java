class Solution {
    public int repeatedNTimes(int[] nums) {
        final int N = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entrySet : map.entrySet()) {
            Integer key = entrySet.getKey();
            Integer value = entrySet.getValue();

            if (value == N) {
                return key;
            }
        }

        return -1;
    }
}