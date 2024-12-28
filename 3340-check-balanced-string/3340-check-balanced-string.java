class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        int idx = 0;

        for (var pos : num.toCharArray()) {
            if (idx % 2 == 0) {
                evenSum += Character.getNumericValue(pos);
            }

            else {
                oddSum += Character.getNumericValue(pos);
            }

            idx++;
        }

        return evenSum == oddSum;
    }
}