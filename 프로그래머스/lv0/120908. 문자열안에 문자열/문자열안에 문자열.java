class Solution {
    public int solution(String str1, String str2) {
        return !str1.contains(str2) || str1.length() < str2.length() ? 2 : 1;
    }
}