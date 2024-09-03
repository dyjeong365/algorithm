class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int copyOfNum = num;

        while (copyOfNum > 0) {
            if (num % (copyOfNum % 10) == 0) {
                ans++;
            }

            copyOfNum /= 10;
        }

        return ans;
    }
}