class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();

        for (var el : s.split(" ")) {
            StringBuilder sb = new StringBuilder();

            sb.append(el);
            answer.append(sb.reverse().toString()).append(" ");
        }

        answer.deleteCharAt(answer.length() - 1);

        return answer.toString();
    }
}