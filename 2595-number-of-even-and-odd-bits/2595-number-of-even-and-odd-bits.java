class Solution {
    public int[] evenOddBit(int n) {
        StringBuilder sb = new StringBuilder();
        int[] ans = new int[2];

        while (n > 1) {
            sb.append(n % 2);
            n /= 2;
        }

        sb.append(n);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                if (i % 2 == 0) {
                    ans[0]++;
                } else {
                    ans[1]++;
                }
            }
        }

        return ans;
    }
}