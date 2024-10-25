class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] word = sentence.split(" ");
        String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

        for (int i = 0; i < word.length; i++) {
            boolean flag = false;

            for (var vowel : vowels) {
                if (word[i].startsWith(vowel)) {
                    sb.append(word[i]);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                sb.append(word[i].substring(1))
                        .append(word[i].charAt(0));
            }

            sb.append("ma");

            for (int j = 0; j < i + 1; j++) {
                sb.append("a");
            }

            if (i < word.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}