class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        final int MAX = 3;
        final int ALPHABET_NUMBERS = 26;
        int[] cnt = new int[ALPHABET_NUMBERS];

        for (int i = 0; i < word1.length(); i++) {
            cnt[word1.charAt(i) - 'a']++;
            cnt[word2.charAt(i) - 'a']--;
        }

        for (var pos : cnt) {
            if (Math.abs(pos) > MAX) {
                return false;
            }
        }

        return true;
    }
}