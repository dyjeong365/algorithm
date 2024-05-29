class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (var num : nums) {
            int count = (int) Math.floor(Math.log10(num) + 1);

            if (count % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}