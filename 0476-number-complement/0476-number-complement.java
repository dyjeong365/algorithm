class Solution {
    public int findComplement(int num) {
        int index = (int) (Math.log(num) / Math.log(2)) + 1;

        return num ^ ((1 << index) - 1);
    }
}