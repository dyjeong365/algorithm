class Solution {
    public String greatestLetter(String s) {
        int[] counts = new int[26];
        Set<Character> set = new HashSet<>();

        for (var pos : s.toCharArray()) {
            set.add(pos);
        }

        for (var pos : set) {
            counts[Character.isUpperCase(pos) ? pos - 'A' : pos - 'a']++;
        }

        for (int i = counts.length - 1; i >= 0; i--) {
            if (counts[i] == 2) {
                return String.valueOf((char) (i + 'A'));
            }
        }

        return "";
    }
}