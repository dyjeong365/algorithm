class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        final int LEN = words.length;
        int res = 0;

        for (int i = 0; i < LEN - 1; i++) {
            for (int j = i + 1; j < LEN; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    res++;
                }
            }
        }

        return res;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}