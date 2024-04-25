class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        for (var el : s) {
            stack.push(el);
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
    }
}