class Solution {
    public String restoreString(String s, int[] indices) {
        final int LEN = s.length();
        char[] answer = new char[LEN];

        for (int i = 0; i < LEN; i++) {
            answer[indices[i]] = s.charAt(i);
        }

        return new String(answer);
    }
}