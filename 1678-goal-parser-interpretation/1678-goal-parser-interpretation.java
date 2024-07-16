class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            char cur = command.charAt(i);

            if (cur == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 2;
                }

                else if (command.charAt(i + 1) == 'a') {
                    sb.append("al");
                    i += 4;
                }
            } else {
                sb.append(cur);
                i++;
            }
        }

        return sb.toString();
    }
}