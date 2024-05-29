class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (var num : nums) {
            // All x such that 10^k <= x < 10^k+1 have k+1 digits where k >= 0
            int count = (int) Math.floor(Math.log10(num) + 1);

            if (count % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}