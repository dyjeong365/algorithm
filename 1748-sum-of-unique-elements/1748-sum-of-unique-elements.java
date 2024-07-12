class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                sum += key;
            }
        }

        return sum;
    }
}