class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char pos = word.charAt(i);

            sb.append(pos);

            if (pos == ch) {
                sb.reverse();
                sb.append(word.substring(i + 1));

                return sb.toString();
            }
        }

        return sb.toString();
    }
}