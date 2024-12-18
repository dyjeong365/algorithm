class Solution {
    public int similarPairs(String[] words) {
        final int LEN = words.length;
        int res = 0;

        for (int i = 0; i < LEN - 1; i++) {
            for (int j = i + 1; j < LEN; j++) {
                if (isSimilar(words[i], words[j])) {
                    res++;
                }
            }
        }

        return res;
    }

    private static boolean isSimilar(String words1, String words2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (var word1 : words1.toCharArray()) {
            set1.add(word1);
        }

        for (var word2 : words2.toCharArray()) {
            set2.add(word2);
        }

        return set1.equals(set2);
    }
}