class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] splitedS = s.split(" ");

        for (int i = 0; i < k; i++) {
            sb.append(splitedS[i])
                    .append(" ");
        }

        return sb.toString().substring(0, sb.length() - 1);
    }
}