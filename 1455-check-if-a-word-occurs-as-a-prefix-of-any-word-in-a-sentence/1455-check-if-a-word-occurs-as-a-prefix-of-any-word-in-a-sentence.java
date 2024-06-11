class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splitedSentence = sentence.split(" ");

        for (int i = 0; i < splitedSentence.length; i++) {
            if (splitedSentence[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}