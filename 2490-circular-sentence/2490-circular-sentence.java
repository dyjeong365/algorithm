class Solution {
    public boolean isCircularSentence(String sentence) {
        final int LEN = sentence.length();

        for (int i = 1; i < LEN; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }

        return sentence.charAt(0) == sentence.charAt(LEN - 1);
    }
}