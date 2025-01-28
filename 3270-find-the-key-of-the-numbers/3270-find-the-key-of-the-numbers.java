class Solution {
    public int generateKey(int num1, int num2, int num3) {
        return Math.min(Math.min(num1 / 1000, num2 / 1000), num3 / 1000) * 1000 +
                Math.min(Math.min(num1 % 1000 / 100, num2 % 1000 / 100), num3 % 1000 / 100) * 100 +
                Math.min(Math.min(num1 % 100 / 10, num2 % 100 / 10), num3 % 100 / 10) * 10
                + Math.min(Math.min(num1 % 10, num2 % 10), num3 % 10);
    }
}