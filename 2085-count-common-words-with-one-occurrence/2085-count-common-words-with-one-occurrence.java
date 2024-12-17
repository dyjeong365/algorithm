class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int res = 0;

        for (var word1 : words1) {
            map1.put(word1, map1.getOrDefault(word1, 0) + 1);
        }

        for (var word2 : words2) {
            map2.put(word2, map2.getOrDefault(word2, 0) + 1);
        }

        for (var entry : map1.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                if (map2.containsKey(key) && map2.get(key) == 1) {
                    res++;
                }
            }
        }

        return res;
    }
}