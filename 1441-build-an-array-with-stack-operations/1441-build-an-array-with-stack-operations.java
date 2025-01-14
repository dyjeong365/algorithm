class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int[] counts = new int[n + 1];

        for (var pos : target) {
            counts[pos]++;
        }

        for (int i = 1; i <= target[target.length - 1]; i++) {
            ans.add("Push");

            if (counts[i] == 0) {
                ans.add("Pop");
            }
        }

        return ans;
    }
}