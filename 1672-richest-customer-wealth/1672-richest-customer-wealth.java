class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (var customer : accounts) {
            var wealth = 0;

            for (var account : customer) {
                wealth += account;
            }

            max = Math.max(max, wealth);
        }

        return max;
    }
}