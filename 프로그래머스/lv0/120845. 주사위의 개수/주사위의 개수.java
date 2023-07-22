class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(var length : box){
            answer *= length/n;
        }
        
        return answer;
    }
}