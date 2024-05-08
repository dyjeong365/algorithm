class Solution {
    public boolean detectCapitalUse(String word) {
        final int LENGTH = word.length();
        boolean isCapitalStart = Character.isUpperCase(word.charAt(0));
        int cnt = isCapitalStart ? 1 : 0;

        for (int i = 1; i < LENGTH; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                if (!isCapitalStart) {
                    return false;
                }

                cnt++;
            }
        }

        return cnt == LENGTH || cnt < 2;
    }
}