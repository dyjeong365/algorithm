class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (ans == 3) {
                return true;
            }

            ans = arr[i] % 2 != 0 ? ans + 1 : 0;
        }

        return false;
    }
}