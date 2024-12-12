class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        int reversed1 = Integer.parseInt(sb.toString());
        sb = new StringBuilder(String.valueOf(reversed1)).reverse();
        int reversed2 = Integer.parseInt(sb.toString());

        return num == reversed2;
    }
}