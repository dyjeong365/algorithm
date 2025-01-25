class Solution {
    public int countCompleteDayPairs(int[] hours) {
        final int LEN = hours.length;
        int res = 0;

        for (int i = 0; i < LEN - 1; i++) {
            for (int j = i + 1; j < LEN; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    res++;
                }
            }
        }

        return res;
    }
}