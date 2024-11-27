class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] splitedSentence = sentence.split(" ");
        final int LEN = splitedSentence.length;

        for (int i = 0; i < LEN; i++) {
            char last = splitedSentence[i].charAt(splitedSentence[i].length() - 1);
            char first = splitedSentence[(i + 1) % LEN].charAt(0);

            if (last != first) {
                return false;
            }
        }

        return true;
    }
}