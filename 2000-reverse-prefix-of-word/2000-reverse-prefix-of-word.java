class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int targetIdx = word.indexOf(ch);

        sb.append(word.substring(0, targetIdx + 1))
                .reverse()
                .append(word.substring(targetIdx + 1));

        return sb.toString();
    }
}