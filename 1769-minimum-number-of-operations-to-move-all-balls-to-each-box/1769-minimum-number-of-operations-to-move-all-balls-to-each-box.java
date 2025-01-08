class Solution {
    public int[] minOperations(String boxes) {
        final int LEN = boxes.length();
        int[] ans = new int[LEN];

        int ballsToLeft = 0, movesToLeft = 0;
        int ballsToRight = 0, movesToRight = 0;

        for (int i = 0; i < LEN; i++) {
            ans[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;

            int j = LEN - 1 - i;
            ans[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }

        return ans;
    }
}