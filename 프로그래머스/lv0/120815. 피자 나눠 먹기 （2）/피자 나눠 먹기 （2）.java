class Solution {
    public int solution(int n) {
        int result = 0;
        final int SLICE = 6;
        
        for (int i=1; i<=SLICE; i++){
            if ((n*i) % SLICE == 0) {
                result = (n*i) / SLICE;
                break;
            }
        }
        return result;
    }
}