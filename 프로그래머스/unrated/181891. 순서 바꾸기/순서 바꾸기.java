class Solution {
    public int[] solution(int[] num_list, int n) {
        final int LENGTH = num_list.length;
        int[] answer = new int[LENGTH];
        
        System.arraycopy(num_list, n, answer, 0, LENGTH-n);
        System.arraycopy(num_list, 0, answer, LENGTH-n, n);
        return answer;
    }
}