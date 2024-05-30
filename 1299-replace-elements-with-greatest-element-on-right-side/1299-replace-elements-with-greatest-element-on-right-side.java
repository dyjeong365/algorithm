class Solution {
    public int[] replaceElements(int[] arr) {
        final int LEN = arr.length;
        
        for (int i = LEN - 2; i > 0; i--) {
            arr[i] = Math.max(arr[i], arr[i + 1]);
        }

        for (int i = 0; i < LEN - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[LEN - 1] = -1;

        return arr;
    }
}