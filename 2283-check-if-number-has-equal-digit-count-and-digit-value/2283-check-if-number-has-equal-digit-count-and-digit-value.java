class Solution {
    public boolean digitCount(String num) {
        final int n = num.length();
        int[] cnt = new int[10];
        char[] splitedNum = num.toCharArray();

        for (var pos : splitedNum) {
            cnt[Character.getNumericValue(pos)]++;
        }

        for (int i = 0; i < n; i++) {
            if (Character.getNumericValue(splitedNum[i]) != cnt[i]) {
                return false;
            }
        }

        return true;
    }
}