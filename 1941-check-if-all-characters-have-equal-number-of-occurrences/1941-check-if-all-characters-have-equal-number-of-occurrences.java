class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] alphabet = new int[27];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        int prev = alphabet[s.charAt(0) - 'a'];

        for (var pos : alphabet) {
            if (pos != 0 && pos != prev) {
                return false;
            }
        }

        return true;
    }
}