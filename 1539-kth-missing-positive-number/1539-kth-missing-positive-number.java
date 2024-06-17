class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (var el : arr) {
            if (el <= k) {
                k++;
            } else
                break;
        }

        return k;
    }
}