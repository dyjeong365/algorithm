class Solution {
    public String freqAlphabets(String s) {
        char alphabet = 'z';

        for (int i = 26; i > 0; i--) {
            if (i > 9) {
                String num = i + "#";
                s = s.replace(num, String.valueOf(alphabet));
            } else {
                s = s.replace(String.valueOf(i), String.valueOf(alphabet));
            }

            alphabet--;
        }

        return s;
    }
}