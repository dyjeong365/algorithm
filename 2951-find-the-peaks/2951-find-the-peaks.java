class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++) {
            int prev = mountain[i - 1];
            int target = mountain[i];
            int next = mountain[i + 1];

            if (target > prev && target > next) {
                ans.add(i);
            }
        }

        return ans;
    }
}