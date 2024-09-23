class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        final int LEN = words.length;
        int ans = 0;

        for (int i = 0; i < LEN; i++) {
            StringBuilder sb = new StringBuilder(words[i]).reverse();

            for (int j = i + 1; j < LEN - 1; j++) {
                if (sb.toString().equals(words[j])) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}