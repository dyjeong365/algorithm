class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;

        for (var pos : text.split(" ")) {
            boolean flag = true;

            for (var brokenLetter : brokenLetters.split("")) {
                if (pos.contains(brokenLetter) && !brokenLetters.isEmpty()) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans++;
            }
        }

        return ans;
    }
}