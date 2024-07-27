class Solution {
    public String replaceDigits(String s) {
        char[] splitedS = s.toCharArray();

        for (int i = 1; i < splitedS.length; i += 2) {
            splitedS[i] = (char) (splitedS[i - 1] + splitedS[i] - '0');
        }

        return new String(splitedS);
    }
}