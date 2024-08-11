class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        List<String> list = new ArrayList<>();

        for (var brokenLetter : brokenLetters.split("")) {
            list.add(brokenLetter);
        }

        for (var splitedText : text.split(" ")) {
            boolean flag = true;

            for (var brokenLetter : list) {
                if (splitedText.contains(brokenLetter) && !brokenLetter.isEmpty()) {
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