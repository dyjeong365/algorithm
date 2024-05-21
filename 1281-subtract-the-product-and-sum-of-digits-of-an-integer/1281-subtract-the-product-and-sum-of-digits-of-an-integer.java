class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        for (var el : String.valueOf(n).toCharArray()) {
            product *= el - '0';
            sum += el - '0';
        }

        return product - sum;
    }
}