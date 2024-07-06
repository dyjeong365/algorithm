class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToInt(firstWord) + stringToInt(secondWord) == stringToInt(targetWord);
    }

    private static int stringToInt(String word) {
        StringBuilder sb = new StringBuilder();
        int res = 0;

        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i) - 'a');
        }

        res = Integer.parseInt(sb.toString());

        return res;
    }
}