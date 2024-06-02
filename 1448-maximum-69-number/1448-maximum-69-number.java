class Solution {
    public int maximum69Number(int num) {
        String strNum = String.valueOf(num);
        final int LEN = strNum.length();
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < LEN; i++) {
            StringBuilder sb = new StringBuilder(strNum);

            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
            }

            int candidateNum = Integer.parseInt(sb.toString());
            answer = Math.max(answer, candidateNum);
        }

        return answer;
    }
}