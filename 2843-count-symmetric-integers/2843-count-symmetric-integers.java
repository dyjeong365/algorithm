class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;

        for (int i = low; i <= high; i++) {
            String strI = String.valueOf(i);
            int n = strI.length() / 2;
            int sumOfHead = 0;
            int sumOfTail = 0;

            for (int j = 0; j < strI.length(); j++) {
                if (j < n) {
                    sumOfHead += Character.getNumericValue(strI.charAt(j));
                }

                else {
                    sumOfTail += Character.getNumericValue(strI.charAt(j));
                }
            }

            if (sumOfHead == sumOfTail) {
                res++;
            }
        }

        return res;
    }
}