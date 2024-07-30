class Solution {
    public int commonFactors(int a, int b) {
        final int MAX = Math.max(a, b);
        final int MIN = Math.min(a, b);
        int cnt = 0;

        for (int i = 1; i <= MIN; i++) {
            if (MAX % i == 0 && MIN % i == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}