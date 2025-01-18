class Solution {
    public int[] diStringMatch(String s) {
        final int LEN = s.length();
        int[] ans = new int[LEN + 1];
        int start = 0;
        int end = LEN;
        int i = 0;

        for (var pos : s.toCharArray()) {
            ans[i++] = pos == 'I' ? start++ : end--;
        }

        ans[i] = start;

        return ans;
    }
}