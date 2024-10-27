class Solution {
    public String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                max = Math.max(max, Integer.parseInt(num.substring(i, i + 3)));
            }
        }

        if (max == 0) {
            return "000";
        }

        else if (max == Integer.MIN_VALUE) {
            return "";
        }

        return String.valueOf(max);
    }
}