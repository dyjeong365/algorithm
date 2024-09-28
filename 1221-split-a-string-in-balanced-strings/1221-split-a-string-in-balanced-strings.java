class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for (var pos : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() == pos) {
                stack.push(pos);
            }

            else {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans++;
            }
        }

        return ans;
    }
}