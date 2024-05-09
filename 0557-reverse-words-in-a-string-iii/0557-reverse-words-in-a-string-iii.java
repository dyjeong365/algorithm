class Solution {
    public String reverseWords(String s) {
        final int LEN = s.length();
        int start = 0;
        char[] splitedS = s.toCharArray();

        for (int i = 0; i <= LEN; i++) {
            if (i == LEN || splitedS[i] == ' ') {
                int end = i - 1;

                while (start < end) {
                    char temp = splitedS[start];
                    splitedS[start] = splitedS[end];
                    splitedS[end] = temp;
                    start++;
                    end--;
                }

                start = i + 1;
            }
        }

        return new String(splitedS);
    }
}