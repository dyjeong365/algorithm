class Solution {
    public int[] minOperations(String boxes) {
        final int LEN = boxes.length();
        int[] ans = new int[LEN];
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < LEN; i++) {
            if (boxes.charAt(i) == '1') {
                indexes.add(i);
            }
        }

        for (int i = 0; i < LEN; i++) {
            for (var index : indexes) {
                ans[i] += Math.abs(i - index);
            }
        }

        return ans;
    }
}