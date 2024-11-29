class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();

        for (var pos : s.toCharArray()) {
            set.add(pos);
        }

        return set.size();
    }
}