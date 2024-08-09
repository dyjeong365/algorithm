class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        String vowels = "aeiou";

        for (int i = left; i <= right; i++) {
            String start = "" + words[i].charAt(0);
            String end = "" + words[i].charAt(words[i].length() - 1);

            if (vowels.contains(start) && vowels.contains(end)) {
                res++;
            }
        }

        return res;
    }
}