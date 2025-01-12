class Solution {
    public int smallestNumber(int n) {
        int pow = 0;

        while (n > 0) {
            n /= 2;
            pow++;
        }

        return (int) Math.pow(2, pow) - 1;
    }
}