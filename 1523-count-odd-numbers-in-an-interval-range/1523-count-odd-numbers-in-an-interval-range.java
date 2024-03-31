class Solution {
    public int countOdds(int low, int high) {
        int num = high - low + 1;

        return low % 2 != 0 && high % 2 != 0 ? num / 2 + 1 : num / 2;
    }
}