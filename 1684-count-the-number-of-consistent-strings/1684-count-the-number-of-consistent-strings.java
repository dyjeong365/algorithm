class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = words.length;
        Set<Character> set = new HashSet<>();

        for (var pos : allowed.toCharArray()) {
            set.add(pos);
        }

        for (var word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))) {
                    res--;
                    break;
                }
            }

        }

        return res;
    }
}