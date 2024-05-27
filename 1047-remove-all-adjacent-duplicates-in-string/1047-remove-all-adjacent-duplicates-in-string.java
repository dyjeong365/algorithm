class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            if (!stack.isEmpty() && stack.peek().equals(target)) {
                stack.pop();
            } else {
                stack.push(target);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}