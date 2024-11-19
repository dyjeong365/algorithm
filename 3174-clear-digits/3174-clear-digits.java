class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (var pos : s.toCharArray()) {
            if (!stack.isEmpty() && Character.isLetter(stack.peek()) && Character.isDigit(pos)) {
                stack.pop();
            }

            else {
                stack.push(pos);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}