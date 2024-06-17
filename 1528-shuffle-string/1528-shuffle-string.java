class Solution {
    public String restoreString(String s, int[] indices) {
        final int LEN = s.length();
        StringBuilder sb = new StringBuilder();
        char[] splitedS = new char[LEN];

        for (int i = 0; i < LEN; i++) {
            splitedS[indices[i]] = s.charAt(i);
        }

        sb.append(splitedS);

        return sb.toString();
    }
}