class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (var operation : operations) {
            if (operation.contains("+")) {
                res++;
            }

            else if (operation.contains("-")) {
                res--;
            }
        }

        return res;
    }
}