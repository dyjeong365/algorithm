class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (var log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else if (!log.equals("./")) {
                stack.push(log);
            }
        }

        return stack.size();
    }
}