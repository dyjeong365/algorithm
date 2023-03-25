class Solution {
    public int solution(int num, int k) {
        
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        
        int result = strNum.indexOf(strK);
        
        return result < 0 ? -1 : result + 1;
    }
}