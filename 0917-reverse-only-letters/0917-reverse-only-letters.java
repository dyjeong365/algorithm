class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (Character.isAlphabetic(letter)) {
                stack.push(letter);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (Character.isAlphabetic(letter)) {
                sb.append(stack.pop());
            } else {
                sb.append(letter);
            }
        }

        return sb.toString();
    }
}