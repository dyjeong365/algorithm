class Solution {
    public boolean divisorGame(int n) {
        return n == 1 ? false : !divisorGame(n - 1);
    }
}