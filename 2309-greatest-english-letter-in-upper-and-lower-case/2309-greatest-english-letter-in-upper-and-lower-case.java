class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();

        for (var pos : s.toCharArray()) {
            set.add(pos);
        }

        for (char c = 'Z'; c >= 'A'; c--) {
            if (set.contains(c) && set.contains((char) ((c - 'A') + 'a'))) {
                return String.valueOf(c);
            }
        }

        return "";
    }
}