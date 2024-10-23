class Solution {
    public int alternateDigitSum(int n) {
        String strN = String.valueOf(n);
        int ans = 0;

        for (int i = 0; i < strN.length(); i++) {
            int digit = strN.charAt(i) - '0';

            ans += i % 2 == 1 ? -digit : digit;
        }

        return ans;
    }
}