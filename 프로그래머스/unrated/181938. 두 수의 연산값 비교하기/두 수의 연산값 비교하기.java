class Solution {
    public int solution(int a, int b) {
        String concat = "" + a + b;
        int intConcat = Integer.parseInt(concat);

        return Math.max(intConcat, 2 * a * b);
    }
}