class Solution {
    public int solution(int[] common) {
        if(common[1] - common[0] == common[2] - common[1]){
            return common[0] + common.length * (common[1] - common[0]);
        } else{
            return common[0] * (int)Math.pow(common[1] / common[0], common.length);
        }
    }
}