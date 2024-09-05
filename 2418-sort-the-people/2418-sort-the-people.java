class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        final int LEN = names.length;
        Map<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        String[] ans = new String[LEN];

        for (int i = 0; i < LEN; i++) {
            map.put(heights[i], names[i]);
        }

        int idx = 0;

        for (var value : map.values()) {
            ans[idx++] = value;
        }

        return ans;
    }
}