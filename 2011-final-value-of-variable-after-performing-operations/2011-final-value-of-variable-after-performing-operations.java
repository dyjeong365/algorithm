class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        // +: 43
        // -: 45
        for (var operation : operations) {
            res += 44 - operation.charAt(1);
        }

        return res;
    }
}