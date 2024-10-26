class Solution {
    public String getEncryptedString(String s, int k) {
        final int LEN = s.length();
        k %= LEN;

        return (s + s).substring(k, k+LEN);
    }
}