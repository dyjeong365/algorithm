class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        final int LEN = A.length;
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        int[] C = new int[LEN];

        for (var a : A) {
            aSet.add(a);
        }

        for (var b : B) {
            bSet.add(b);
        }

        for (int i = 0; i < LEN; i++) {
            for (int j = LEN - 1 - i; j >= 0; j--) {
                if (bSet.contains(A[j])) {
                    C[LEN - 1 - i]++;
                }
            }

            aSet.remove(A[LEN - 1 - i]);
            bSet.remove(B[LEN - 1 - i]);
        }

        return C;
    }
}