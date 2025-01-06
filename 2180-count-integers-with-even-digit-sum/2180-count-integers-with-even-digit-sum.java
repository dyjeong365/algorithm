class Solution {
    public int countEven(int num) {
        int res = 0;

        for (int i = 2; i <= num; i++) {
            if (isEvenDigitSum(i)) {
                res++;
            }
        }

        return res;
    }

    private boolean isEvenDigitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum % 2 == 0;
    }
}