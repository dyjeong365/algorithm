class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int twentyFivePer = arr.length / 4;

        for (var pos : arr) {
            map.put(pos, map.getOrDefault(pos, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > twentyFivePer) {
                return key;
            }
        }

        return -1;
    }
}