class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char pos = word.charAt(i);
            sb.append(pos);

            if (pos == ch) {
                sb.reverse();
                ch = 'F';
            }
        }

        return sb.toString();
    }
}