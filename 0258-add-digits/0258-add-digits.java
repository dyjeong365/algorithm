class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int sum = 0;

        while (num >= 10) {
            sum = 0;

            for (var el : String.valueOf(num).toCharArray()) {
                sum += (el - '0');
            }

            num = sum;
        }

        return sum;
    }
}