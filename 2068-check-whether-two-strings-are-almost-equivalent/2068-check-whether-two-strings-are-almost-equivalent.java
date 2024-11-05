class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        final int MAX = 3;
        final int ALPHABET_NUMBERS = 27;
        int[] frequencyOfWord1 = new int[ALPHABET_NUMBERS];
        int[] frequencyOfWord2 = new int[ALPHABET_NUMBERS];

        for (var pos : word1.toCharArray()) {
            frequencyOfWord1[pos - 'a']++;
        }

        for (var pos : word2.toCharArray()) {
            frequencyOfWord2[pos - 'a']++;
        }

        for (var pos : word1.toCharArray()) {
            if (Math.abs(frequencyOfWord1[pos - 'a'] - frequencyOfWord2[pos - 'a']) > MAX) {
                return false;
            }
        }

        for (var pos : word2.toCharArray()) {
            if (Math.abs(frequencyOfWord1[pos - 'a'] - frequencyOfWord2[pos - 'a']) > MAX) {
                return false;
            }
        }

        return true;
    }
}