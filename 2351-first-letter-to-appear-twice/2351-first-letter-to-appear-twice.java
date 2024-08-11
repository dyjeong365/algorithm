class Solution {
    public char repeatedCharacter(String s) {
        int[] counts = new int[27];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            counts[idx]++;

            if (counts[idx] == 2) {
                return s.charAt(i);
            }
        }

        return ' ';
    }
}