class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (var sentence : sentences) {
            max = Math.max(max, sentence.split(" ").length);
        }

        return max;
    }
}