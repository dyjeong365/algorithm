class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (var sentence : sentences) {
            int numberOfWords = sentence.length() - sentence.replace(" ", "").length() + 1;
            max = Math.max(max, numberOfWords);
        }

        return max;
    }
}