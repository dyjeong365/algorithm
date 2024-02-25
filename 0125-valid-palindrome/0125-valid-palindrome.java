class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase(););

        return sb.toString().equals(sb.reverse().toString());
    }
}