class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /*
         * if a string s can be constructed by repeating a substring, then concatenating
         * two copies of s together and removing the first and last character would
         * still contain s as a substring.
         */
        String doubled = s + s;

        return doubled.substring(1, doubled.length() - 1)
                .contains(s);
    }
}