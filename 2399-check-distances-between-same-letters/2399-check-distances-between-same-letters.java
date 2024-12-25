class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) >= 0 && (s.lastIndexOf(c) - s.indexOf(c) - 1) != distance[c - 'a']) {
                return false;
            }
        }

        return true;
    }
}