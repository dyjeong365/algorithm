class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (int i = left; i <= right; i++) {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length() - 1);

            if (vowels.contains(start) && vowels.contains(end)) {
                res++;
            }
        }

        return res;
    }
}