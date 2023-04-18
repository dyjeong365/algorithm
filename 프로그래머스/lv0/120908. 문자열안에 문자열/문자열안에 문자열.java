class Solution {
    public int solution(String str1, String str2) {
        return str1.indexOf(str2) == -1 || str1.length() < str2.length() ? 2 : 1;
    }
}