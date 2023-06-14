class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i=0; i<date1.length; i++){
            if(date2[i] - date1[i] > 0) return 1;
            else if(date2[i] - date1[i] < 0) return 0;
        }
        return 0;
    }
}