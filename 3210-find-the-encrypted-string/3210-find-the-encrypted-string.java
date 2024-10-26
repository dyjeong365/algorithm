class Solution {
    public String getEncryptedString(String s, int k) {
        final int LEN = s.length();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < LEN; i++) {
            sb.setCharAt(i, s.charAt((i + k) % LEN));
        }

        return sb.toString();
    }
}