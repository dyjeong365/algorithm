class Solution {
    public boolean areNumbersAscending(String s) {
        int min = Integer.MIN_VALUE;

        for (var pos : s.split(" ")) {
            if (Character.isDigit(pos.charAt(0))) {
                int value = Integer.parseInt(pos);

                if (value <= min) {
                    return false;
                }

                min = value;
            }
        }

        return true;
    }
}