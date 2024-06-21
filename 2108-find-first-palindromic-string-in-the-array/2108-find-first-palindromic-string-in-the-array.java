class Solution {
    public String firstPalindrome(String[] words) {
        for (var word : words) {
            StringBuilder reversedWord = new StringBuilder(word);

            if (word.equals(reversedWord.reverse().toString())) {
                return word;
            }
        }

        return "";
    }
}