class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int copyOfX = x;

        while (copyOfX > 0) {
            sum += copyOfX % 10;
            copyOfX /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}