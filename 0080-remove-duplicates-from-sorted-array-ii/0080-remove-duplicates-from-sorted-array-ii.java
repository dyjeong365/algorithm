class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (var el : nums) {
            if (map.containsKey(el)) {
                if (map.get(el) != 2) {
                    map.put(el, map.get(el) + 1);
                }
            } else
                map.put(el, 1);
        }

        int idx = 0;

        for (var el : map.entrySet()) {
            int key = el.getKey();
            int value = el.getValue();

            while (value-- > 0) {
                nums[idx++] = key;
            }
        }

        return idx;
    }
}