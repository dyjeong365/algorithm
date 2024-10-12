class Solution {
    public int[] finalPrices(int[] prices) {
        final int LEN = prices.length;

        for (int i = 0; i < LEN - 1; i++) {
            for (int j = i + 1; j < LEN; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }

        return prices;
    }
}