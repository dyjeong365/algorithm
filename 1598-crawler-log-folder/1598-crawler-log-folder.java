class Solution {
    public int minOperations(String[] logs) {
        int res = 0;

        for (var log : logs) {
            if (log.equals("../") && res > 0) {
                res--;
            }

            else if (!log.equals("../") && !log.equals("./")) {
                res++;
            }
        }

        return res;
    }
}