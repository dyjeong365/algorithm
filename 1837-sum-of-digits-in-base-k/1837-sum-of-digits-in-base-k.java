class Solution {
    public int sumBase(int n, int k) {
        int value = convert(n, k);
        int res = 0;

        while (value != 0) {
            res += value % 10;
            value /= 10;
        }

        return res;
    }

    private static int convert(int num, int base) {
        int pow = 1;
        int res = 0;

        while (num != 0) {
            int r = num % base;
            num /= base;
            res += r * pow;
            pow *= 10;
        }

        return res;
    }
}