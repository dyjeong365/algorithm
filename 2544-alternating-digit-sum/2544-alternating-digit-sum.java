class Solution {
    public int alternateDigitSum(int n) {
        String strN = String.valueOf(n);
        int ans = 0;
        int factor = 1;

        for (var pos : strN.toCharArray()) {
            ans += Character.getNumericValue(pos) * factor;
            factor *= -1;
        }

        return ans;
    }
}