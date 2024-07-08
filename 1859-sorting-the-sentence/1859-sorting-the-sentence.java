class Solution {
    public String sortSentence(String s) {
        String[] splitedS = s.split(" ");
        int len = splitedS.length;
        int idx = 1;
        StringBuilder sb = new StringBuilder();

        while (len-- > 0) {
            for (var pos : splitedS) {
                if (pos.contains(String.valueOf(idx))) {
                    sb.append(pos.substring(0, pos.length() - 1))
                            .append(" ");

                    idx++;
                }
            }
        }

        return sb.toString().substring(0, sb.length() - 1);
    }
}