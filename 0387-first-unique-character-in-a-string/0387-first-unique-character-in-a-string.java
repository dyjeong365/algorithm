class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        char[] alphabet = new char[26];

        for (int i = 0; i < len; i++) {
            if (alphabet[s.charAt(i) - 'a'] < 2) {
                alphabet[s.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < len; i++) {
            if (alphabet[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}