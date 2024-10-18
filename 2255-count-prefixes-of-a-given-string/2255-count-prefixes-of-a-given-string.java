class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;

        for (var word : words) {
            if (s.startsWith(word)) {
                ans++;
            }
        }

        return ans;
    }
}