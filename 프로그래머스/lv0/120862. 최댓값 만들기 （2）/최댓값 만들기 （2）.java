class Solution {
    public int solution(int[] numbers) {
        final int LENGTH = numbers.length;
        int max = numbers[0] * numbers[1];
        int multiplication = 0;
        
        for(int i=0; i<LENGTH-1; i++){
            for(int j=i+1; j<LENGTH; j++){
                if(i==0 && j==1) continue;
                multiplication = numbers[i] * numbers[j];
                max = Math.max(max, multiplication);
            }
        }
        return max;
    }
}