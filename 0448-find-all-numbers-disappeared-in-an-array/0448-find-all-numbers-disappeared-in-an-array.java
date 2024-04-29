class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        /*
         * We can use the current element as an index and flag its value (in place).
         * All numbers are > 0, so we can use a negative number.
         */
        for (var num : nums) {
            int idx = Math.abs(num) - 1;

            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}