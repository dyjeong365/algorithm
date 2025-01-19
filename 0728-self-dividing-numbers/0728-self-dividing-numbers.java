class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            boolean flag = true;

            for (var pos : String.valueOf(i).toCharArray()) {
                if (pos == '0' || (i % (pos - '0') != 0)) {
                    flag = false;
                }
            }

            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }
}