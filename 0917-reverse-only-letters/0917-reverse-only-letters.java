class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char startChar = arr[start];
            char endChar = arr[end];

            if (Character.isLetter(startChar) && Character.isLetter(endChar)) {
                arr[start++] = endChar;
                arr[end--] = startChar;
            }

            if (!Character.isLetter(startChar)) {
                start++;
            }

            if (!Character.isLetter(endChar)) {
                end--;
            }
        }

        return new String(arr);
    }
}