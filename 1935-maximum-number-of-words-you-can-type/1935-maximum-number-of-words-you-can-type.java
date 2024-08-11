class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] splitedText = text.split(" ");
        final int LEN = splitedText.length;
        int ans = LEN;
        Set<Character> set = new HashSet<>();

        for (var brokenLetter : brokenLetters.toCharArray()) {
            set.add(brokenLetter);
        }

        for (var pos : splitedText) {
            for (var splitedPos : pos.toCharArray()) {
                if (set.contains(splitedPos)) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}