class Solution {
    public int numTeams(int[] rating) {
        final int LEN = rating.length;
        int res = 0;

        for (int i = 0; i < LEN - 2; i++) {
            for (int j = i + 1; j < LEN - 1; j++) {
                for (int k = j + 1; k < LEN; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k])
                            || (rating[i] > rating[j] && rating[j] > rating[k])) {
                        res++;
                    }
                }
            }
        }

        return res;
    }
}