class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int i = 2;
        
        if(denom1 == denom2){
            int denom = denom1;
            int numer = numer1 + numer2;
        }
        
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        while(i <= denom && i <= numer){
            if(numer % i == 0 && denom % i == 0){
                denom /= i;
                numer /= i;
                continue;
            }
            i++;
        }
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}