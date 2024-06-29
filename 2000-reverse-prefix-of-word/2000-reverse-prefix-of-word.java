class Solution {
    public String reversePrefix(String word, char ch) {
        char[] res = word.toCharArray();
        int start = 0;
        int end = word.indexOf(ch);

        while (start <= end) {
            swap(res, start, end);
            start++;
            end--;
        }

        return new String(res);
    }

    private static void swap(char[] res, int start, int end) {
        char temp = res[end];
        res[end] = res[start];
        res[start] = temp;
    }
}