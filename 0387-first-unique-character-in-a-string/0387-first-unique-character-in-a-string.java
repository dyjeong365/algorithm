class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (var el : c) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i]) && map.get(c[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}