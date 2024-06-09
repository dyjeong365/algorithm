class Solution {
    public int findLucky(int[] arr) {
        int[] counts = new int[501];

        for (var el : arr) {
            counts[el]++;
        }

        for (int i = counts.length - 1; i > 0; i--) {
            if (counts[i] == i) {
                return i;
            }
        }

        return -1;
    }
}