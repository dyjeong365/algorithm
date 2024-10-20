class Solution {
    public int countTriples(int n) {
        int ans = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                for (int c = b + 1; c <= n; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        ans += 2;
                    }
                }
            }
        }

        return ans;
    }
}