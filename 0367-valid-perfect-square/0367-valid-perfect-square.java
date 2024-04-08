class Solution {
    public boolean isPerfectSquare(int num) {
        long result = 0;
        long order = 1;

        while (result <= num) {
            result = order * order;
            order++;

            if (result == num) {
                return true;
            }
        }

        return false;
    }
}