class Solution {
    public boolean divisorGame(int n) {
        boolean flag = false;

        while (n > 1) {
            for (int x = 1; x < n; x++) {
                if (n % x == 0) {
                    n -= x;
                    flag = !flag;
                    break;
                }
            }
        }

        return flag;
    }
}