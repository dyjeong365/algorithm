class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;

                return digits;
            }

            digits[i] = 0;
        }

        /*
         * by default new array values are set to -->0 only
         * thus just changed first value of array to 1 and return the array
         */
        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
}