class Solution {
    public String freqAlphabets(String s) {
        char alphabet = 'z';

        for (int i = 26; i > 0; i--, alphabet--) {
            s = s.replace(i > 9 ? i + "#" : String.valueOf(i), String.valueOf(alphabet));
        }

        return s;
    }
}