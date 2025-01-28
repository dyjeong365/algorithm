class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        final int DIGITS = 4;

        for (int i = 0; i < DIGITS - String.valueOf(num1).length(); i++) {
            sb1.append("0");
        }

        sb1.append(num1);

        for (int i = 0; i < DIGITS - String.valueOf(num2).length(); i++) {
            sb2.append("0");
        }

        sb2.append(num2);

        for (int i = 0; i < DIGITS - String.valueOf(num3).length(); i++) {
            sb3.append("0");
        }

        sb3.append(num3);

        for (int i = 0; i < DIGITS; i++) {
            ans.append(
                    Math.min(Math.min(Character.getNumericValue(sb1.charAt(i)),
                            Character.getNumericValue(sb2.charAt(i))),
                            Character.getNumericValue(sb3.charAt(i))));
        }

        return Integer.parseInt(ans.toString());
    }
}