class Solution {
    public String truncateSentence(String s, int k) {
        int i = 0;
        int space = 0;

        while (i < s.length() && space < k) {
            if (s.charAt(i) == ' ') {
                space++;
            }

            i++;
        }

        return i == s.length() ? s : s.substring(0, i - 1);
    }
}