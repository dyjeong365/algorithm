class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;

        for(var el : s.toCharArray()) {
            c ^= el;
        }

        for(var el : t.toCharArray()) {
            c ^= el;
        }

        return c;
    }
}