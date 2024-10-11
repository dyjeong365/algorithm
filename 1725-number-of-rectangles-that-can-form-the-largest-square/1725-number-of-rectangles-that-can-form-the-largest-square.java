class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);

        for (var rectangle : rectangles) {
            int length = rectangle[0];
            int width = rectangle[1];
            int key = Math.min(length, width);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (var value : map.values()) {
            return value;
        }

        return -1;
    }
}