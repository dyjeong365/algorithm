class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
        
        for(int i=0; i<n+1; i++) {
            count[i] = countNumberOfOne(i);
        }
        
        return count;
    }
    
    private int countNumberOfOne(int i) {
        int count = 0;
        
        while(i != 0) {
            if(i % 2 == 1) {
                count++;
            }
            
            if(i / 2 == 1) {
                count++;
                break;
            }
            
            i /= 2;
        }
        
        return count;
    }
}