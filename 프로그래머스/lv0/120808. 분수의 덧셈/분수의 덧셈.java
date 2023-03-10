class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int i = 2;
        int denom = 0;
        int numer = 0;
        
        if(denom1 == denom2){
            denom = denom1;
            numer = numer1 + numer2;
        }
        
        denom = denom1 * denom2;
        numer = (numer1 * denom2) + (numer2 * denom1);
        
        while(i <= denom && i <= numer){
            if( (numer % i == 0) && (denom % i == 0) ){
                denom /= i;
                numer /= i;
                continue;
            }
            i++;
        }
        return new int[]{numer,denom};
    }
}