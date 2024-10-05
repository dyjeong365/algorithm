class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(i, (char) Math.min(s.charAt(i), s.charAt(s.length() - 1 - i)));
        }

        return sb.toString();
    }
}