class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        final int LEN = arr.length;
        int cnt = 0;

        for (int i = 0; i < LEN - 2; i++) {
            for (int j = i + 1; j < LEN - 1; j++) {
                for (int k = j + 1; k < LEN; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}