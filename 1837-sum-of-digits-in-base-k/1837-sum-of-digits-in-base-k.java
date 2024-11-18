class Solution {
    public int sumBase(int n, int k) {
        int res = 0;
        String baseK = Integer.toString(n, k);

        for (var pos : baseK.toCharArray()) {
            res += (pos - '0');
        }

        return res;
    }
}