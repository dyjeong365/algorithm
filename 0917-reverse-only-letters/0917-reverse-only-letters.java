class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char el = s.charAt(i);

            if (Character.isLetter(el)) {
                sb.append(el);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char el = s.charAt(i);

            if (!Character.isLetter(el)) {
                sb.insert(i, el);
            }
        }

        return sb.toString();
    }
}