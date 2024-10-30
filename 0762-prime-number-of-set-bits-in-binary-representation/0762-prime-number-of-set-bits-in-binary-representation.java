class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                ans++;
            }
        }

        return ans;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return num < 2 ? false : true;
    }
}