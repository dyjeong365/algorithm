class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (i % 10 != 0) {
                int pos = i;
                boolean flag = true;

                while (pos > 0) {
                    int digit = pos % 10;

                    if (digit == 0 || i % digit != 0) {
                        flag = false;
                        break;
                    }

                    pos /= 10;
                }

                if (flag) {
                    ans.add(i);
                }
            }
        }

        return ans;
    }
}