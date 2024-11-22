class Solution {
    public int numberOfSpecialChars(String word) {
        final int ALPHABET_NUMBERS = 26;
        int[] upperCase = new int[ALPHABET_NUMBERS];
        int[] lowerCase = new int[ALPHABET_NUMBERS];
        int res = 0;

        for (var pos : word.toCharArray()) {
            if (Character.isUpperCase(pos)) {
                upperCase[pos - 'A']++;
            }

            else if (Character.isLowerCase(pos)) {
                lowerCase[pos - 'a']++;
            }
        }

        for (int i = 0; i < ALPHABET_NUMBERS; i++) {
            if (upperCase[i] > 0 && lowerCase[i] > 0) {
                res++;
            }
        }

        return res;
    }
}