class Solution {
    public String restoreString(String s, int[] indices) {
        final int LEN = s.length();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < LEN; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}