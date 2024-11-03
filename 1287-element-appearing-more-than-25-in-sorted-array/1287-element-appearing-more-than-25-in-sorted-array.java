class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int twentyFivePer = arr.length / 4;

        for (var pos : arr) {
            map.put(pos, map.getOrDefault(pos, 0) + 1);
        }

        for (var key : map.keySet()) {
            if (map.get(key) > twentyFivePer) {
                return key;
            }
        }

        return -1;
    }
}