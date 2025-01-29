class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        final int LEN = A.length;
        int[] frequencies = new int[LEN + 1];
        int[] ans = new int[LEN];
        int cnt = 0;

        for (int i = 0; i < LEN; i++) {
            frequencies[A[i]]++;

            if (frequencies[A[i]] == 2) {
                cnt++;
            }

            frequencies[B[i]]++;

            if (frequencies[B[i]] == 2) {
                cnt++;
            }

            ans[i] += cnt;
        }

        return ans;
    }
}