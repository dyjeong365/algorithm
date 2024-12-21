class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var pos : map.keySet()) {
            int value = map.get(pos);

            if (value == 1) {
                res[i++] = pos;
            }
        }

        return res;
    }
}