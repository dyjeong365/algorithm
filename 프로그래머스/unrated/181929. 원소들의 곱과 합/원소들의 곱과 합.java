class Solution {
    public int solution(int[] num_list) {
        int multiplication = 1;
        int sum = 0;
        
        for(var num : num_list){
            multiplication *= num;
            sum += num;
        }
        return multiplication < Math.pow(sum, 2) ? 1 : 0;
    }
}