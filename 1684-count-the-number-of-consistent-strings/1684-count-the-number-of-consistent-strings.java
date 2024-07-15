class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = words.length;
        int[] alphabet = new int[26];

        for (var pos : allowed.toCharArray()) {
            alphabet[pos - 'a']++;
        }

        for (var word : words) {
            for (var el : word.toCharArray()) {
                if (alphabet[el - 'a'] <= 0) {
                    res--;
                    break;
                }
            }
        }

        return res;
    }
}