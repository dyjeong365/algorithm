class Solution {
    public int[] decrypt(int[] code, int k) {
        final int LEN = code.length;
        int[] ans = new int[LEN];
        int start = 1;
        int end = k;
        int sum = 0;

        if (k < 0) {
            start = LEN + k;
            end = LEN - 1;
        }

        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < LEN; i++) {
            ans[i] = sum;
            sum -= code[start % LEN];
            sum += code[(end + 1) % LEN];
            start++;
            end++;
        }

        return ans;
    }
}