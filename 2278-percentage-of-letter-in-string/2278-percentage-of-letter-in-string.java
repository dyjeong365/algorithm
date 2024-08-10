class Solution {
    public int percentageLetter(String s, char letter) {
        int ans = 0;
        final int LEN = s.length();

        for (int i = 0; i < LEN; i++) {
            if (s.charAt(i) == letter) {
                ans++;
            }
        }

        ans = (int) (((double) ans / LEN) * 100);
        
        return ans;
    }
}