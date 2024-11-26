class Solution {
    public int minOperations(String[] logs) {
        int res = 0;

        for (var log : logs) {
            if (log.equals("../")) {
                res = Math.max(0, res - 1);
            }

            else if (!log.equals("./")) {
                res++;
            }
        }

        return res;
    }
}