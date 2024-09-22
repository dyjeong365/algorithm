class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int copyOfX = x;

        while (copyOfX >= 10) {
            sum += copyOfX % 10;
            copyOfX /= 10;
        }

        sum += copyOfX;

        return x % sum == 0 ? sum : -1;
    }
}