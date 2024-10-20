class Solution {
    public int countTriples(int n) {
        int ans = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                int sq = a * a + b * b;
                int r = (int) Math.sqrt(sq);

                if (r * r == sq && r <= n) {
                    ans += 2;
                }
            }
        }

        return ans;
    }
}