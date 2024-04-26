class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (var entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                return s.indexOf(entrySet.getKey());
            }
        }

        return -1;
    }
}