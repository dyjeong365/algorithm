class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        final int LEN = A.length;
        int[] frequencies = new int[LEN + 1];
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            frequencies[A[i]]++;
            frequencies[B[i]]++;

            for (var pos : frequencies) {
                if (pos != 0 && pos % 2 == 0) {
                    ans[i]++;
                }
            }
        }

        return ans;
    }
}