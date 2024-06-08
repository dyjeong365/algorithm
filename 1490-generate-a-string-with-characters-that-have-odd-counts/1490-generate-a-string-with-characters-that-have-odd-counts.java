class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int cnt = (n % 2 == 0) ? n - 1 : n;

        for (int i = 0; i < cnt; i++) {
            sb.append("a");
        }

        if (n % 2 == 0) {
            sb.append("b");
        }

        return sb.toString();
    }
}