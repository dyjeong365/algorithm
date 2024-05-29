class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (var num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}