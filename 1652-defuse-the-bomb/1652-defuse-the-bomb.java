class Solution {
    public int[] decrypt(int[] code, int k) {
        final int LEN = code.length;
        int[] ans = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int copyOfK = k;

            while (copyOfK != 0) {
                int idx = i + copyOfK;

                if (idx < 0) {
                    idx += LEN;
                }

                ans[i] += code[(idx) % LEN];

                if (k > 0) {
                    copyOfK--;
                }

                else if (k < 0) {
                    copyOfK++;
                }
            }
        }

        return ans;
    }
}